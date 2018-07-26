package ru.anvs;

public abstract class Currency extends Object {
    enum SignPosition {BEFORE, AFTER}

    private final SignPosition signPosition;
    private final String sign;
    private Double amount = 0.0;

    protected Currency(final String sign, Currency.SignPosition pos){
        this.sign = sign;
        this.signPosition = pos;
    }

    public void setAmount(final Double newAmount) {
        this.amount = newAmount;
    }
    
    public Double getAmount() {
        /**
         * TODO: think about 2 digits after comma
         */
        return this.amount;
    }
    
    public Currency add(final Currency summand) {
        if (this.getClass() == summand.getClass()) {
        this.amount =+ summand.getAmount();
        }
        return this;
    }

    public Currency sub(final Currency subtrahend) {
        if (this.getClass() == subtrahend.getClass()) {
            this.amount =- subtrahend.getAmount();
        }
        return this;
    }

    @Override
    public String toString() {
        String retVal = this.amount.toString();
        if (this.signPosition == Currency.SignPosition.BEFORE) {
            retVal = this.sign + retVal;
        }
        if (this.signPosition == Currency.SignPosition.AFTER) {
            retVal = retVal + this.sign;
        }
        return retVal;
    }

}