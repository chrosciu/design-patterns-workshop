package eu.chrost.patterns.behavioral.state;

import lombok.RequiredArgsConstructor;

import static eu.chrost.patterns.behavioral.state.VendingMachine.State.IDLE;
import static eu.chrost.patterns.behavioral.state.VendingMachine.State.PAID;
import static eu.chrost.patterns.behavioral.state.VendingMachine.State.PAYING;
import static eu.chrost.patterns.behavioral.state.VendingMachine.State.EMPTY;

@RequiredArgsConstructor
class VendingMachine {
    enum State {
        IDLE,
        PAYING,
        PAID,
        EMPTY
    }

    private final int productPrice;
    private int productsAmount = 0;
    private int insertedMoneyAmount = 0;
    private State state = EMPTY;

    public String insertMoney(int moneyAmount) {
        return switch (state) {
            case IDLE, PAYING -> {
                insertedMoneyAmount += moneyAmount;
                if (insertedMoneyAmount >= productPrice) {
                    state = PAID;
                } else {
                    state = PAYING;
                }
                yield "Money accepted";
            }
            case PAID -> "Already paid - please request dispensation";
            case EMPTY -> "Cannot accept money - items sold out";
        };
    }

    public String dispenseProduct() {
        return switch (state) {
            case IDLE, PAYING -> {
                var toPay = productPrice - insertedMoneyAmount;
                yield  String.format("Cannot dispense product - amount %d must be paid", toPay);
            }
            case PAID -> {
                var change = insertedMoneyAmount - productPrice;
                insertedMoneyAmount = 0;
                productsAmount--;
                if (productsAmount > 0) {
                    state = IDLE;
                } else {
                    state = EMPTY;
                }
                yield String.format("Dispensing product and change %d", change);
            }
            case EMPTY -> "Items sold out";
        };
    }

    public String cancelPurchase() {
        return switch (state) {
            case IDLE, EMPTY -> "Nothing happens";
            case PAYING, PAID -> {
                var toReturn = insertedMoneyAmount;
                insertedMoneyAmount = 0;
                state = IDLE;
                yield String.format("Returning %d", toReturn);
            }
        };
    }

    public String refill(int productsBatchAmount) {
        return switch (state) {
            case IDLE -> "Cannot refill - there are still some products";
            case PAYING, PAID -> "Cannot refill - purchase in progress";
            case EMPTY -> {
                productsAmount = productsBatchAmount;
                state = IDLE;
                yield "Machine refilled";
            }
        };
    }

}
