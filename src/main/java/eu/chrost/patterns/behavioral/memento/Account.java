package eu.chrost.patterns.behavioral.memento;

import lombok.Getter;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

@Getter
public class Account {
    private boolean locked = false;
    private BigDecimal balance = ZERO;

    public void deposit(BigDecimal value) {
        balance = balance.add(value);
    }

    public void lock() {
        locked = true;
    }

    public AccountSnapshot createSnapshot() {
        //TODO: Implement
        return null;
    }

    public class AccountSnapshot {
        //TODO: Implement

        public void restore() {
            //TODO: Implement
        }
    }
}
