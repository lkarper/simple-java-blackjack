package com.thinkful.blackjack;

public enum Suit {
    CLUBS("\u2663"),
    HEARTS("\u2665"),
    SPADES("\u2660"),
    DIAMONDS("\u2666");

    public final String symbol;

    private Suit(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol;
    }
}
