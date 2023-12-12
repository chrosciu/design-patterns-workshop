package eu.chrost.patterns.behavioral.memento;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

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
        return new AccountSnapshot(balance, locked);
    }

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    public class AccountSnapshot {
        private final BigDecimal balance;
        private final boolean locked;

        public void restore() {
            Account.this.balance = this.balance;
            Account.this.locked = this.locked;
        }
    }
}
