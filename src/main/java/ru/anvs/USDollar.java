package ru.anvs;

public class USDollar extends Currency {

    public USDollar() {
        super("$", Currency.SignPosition.BEFORE);
    }

    public USDollar(final Double amount) {
        super("$", Currency.SignPosition.BEFORE);
        this.setAmount(amount);
    }
}