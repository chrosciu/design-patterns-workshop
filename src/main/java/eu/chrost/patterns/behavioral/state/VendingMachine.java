package eu.chrost.patterns.behavioral.state;

import lombok.RequiredArgsConstructor;

import static eu.chrost.patterns.behavioral.state.VendingMachine.State.IDLE;
import static eu.chrost.patterns.behavioral.state.VendingMachine.State.PAID;
import static eu.chrost.patterns.behavioral.state.VendingMachine.State.PAYING;
import static eu.chrost.patterns.behavioral.state.VendingMachine.State.SOLD_OUT;

@RequiredArgsConstructor
class VendingMachine {
    enum State {
        IDLE,
        PAYING,
        PAID,
        SOLD_OUT
    }

    private final int productPrice;
    private int productsAmount = 0;
    private int insertedMoneyAmount = 0;
    private State state = SOLD_OUT;

    public String insertMoney(int moneyAmount) {
        switch (state) {
            case IDLE:
            case PAYING:
                insertedMoneyAmount += moneyAmount;
                if (insertedMoneyAmount >= productPrice) {
                    state = PAID;
                } else {
                    state = PAYING;
                }
                return "Money accepted";
            case PAID:
                return "Already paid - please request dispensation";
            case SOLD_OUT:
                return "Cannot accept money - items sold out";
            default:
                throw new IllegalStateException("Unknown machine state");
        }
    }

    public String dispenseProduct() {
        switch (state) {
            case IDLE:
            case PAYING:
                var toPay = productPrice - insertedMoneyAmount;
                return String.format("Cannot dispense product - amount %d must be paid", toPay);
            case PAID:
                var change = insertedMoneyAmount - productPrice;
                insertedMoneyAmount = 0;
                productsAmount--;
                if (productsAmount > 0) {
                    state = IDLE;
                } else {
                    state = SOLD_OUT;
                }
                return String.format("Dispensing product and change %d", change);
            case SOLD_OUT:
                return "Items sold out";
            default:
                throw new IllegalStateException("Unknown machine state");
        }
    }

    public String cancelPurchase() {
        switch (state) {
            case IDLE:
            case SOLD_OUT:
                return "Nothing happens";
            case PAYING:
            case PAID:
                var toReturn = insertedMoneyAmount;
                insertedMoneyAmount = 0;
                state = IDLE;
                return String.format("Returning %d", toReturn);
            default:
                throw new IllegalStateException("Unknown machine state");
        }
    }

    public String refill(int productsBatchAmount) {
        switch (state) {
            case IDLE:
                return "Cannot refill - there are still some products";
            case PAYING:
            case PAID:
                return "Cannot refill - purchase in progress";
            case SOLD_OUT:
                productsAmount = productsBatchAmount;
                state = IDLE;
                return "Machine refilled";
            default:
                throw new IllegalStateException("Unknown machine state");
        }
    }

}
