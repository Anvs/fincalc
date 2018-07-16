package ru.anvs;

public abstract class Currency {
    private final String name;
    private final String sign;
    private Double amount;
    private final Boolean signPosition; 
    public Currency(String n, String s, Boolean p) {
        name = n;
        sign = s;
        signPosition = p;
        
    }



}