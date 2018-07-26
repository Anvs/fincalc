package ru.anvs;

public class Euro extends Currency {

    public Euro() {
        super("EUR", Currency.SignPosition.AFTER);
    }

    public Euro(final Double amount) {
        super("EUR", Currency.SignPosition.AFTER);
        this.setAmount(amount);
    }
}