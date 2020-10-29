package com.thinkful.blackjack;

public enum Face {
    ACE(1, "A"),
    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(10, "J"),
    QUEEN(10, "Q"),
    KING(10, "K");

    public final int value;
    public final String symbol;
    private Face(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol;
    }
}
