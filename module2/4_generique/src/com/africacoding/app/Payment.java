package com.africacoding.app;

public class Payment<T> { // Payment<T, S, U, V>

    private T person;

    public void payer(T person) {
        this.person = person;
    }

    public T getPerson() {
        return person;
    }
}
