package com.thinkful.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    // constant variable
    private List<Card> cards;

    public Deck() {
        this.setCards(new ArrayList<>());
        int i = 0;
        for(Suit suit: Suit.values()) {
            for(Face face: Face.values()) {
                this.getCards().add(new Card(suit, face));
                i++;
            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Card c: this.getCards()) {
            sb.append(String.format("%s,", c));
        }
        if (this.getCards().size() > 0) {
            sb.deleteCharAt(sb.length() - 1); // Remove trailing comma
        }
        sb.append("]");
        return sb.toString();
    }

    public void shuffle() {
        Random ran = new Random();
        for(int i = 0; i < this.getCards().size(); i++) {
            Card c = this.getCards().remove(i);
            int randomNumber = ran.nextInt(this.getCards().size());
            this.getCards().add(randomNumber, c);
        }
    }

    public Card deal() {
        if(this.getCards().isEmpty()) {
            return null;
        }
        return this.getCards().remove(0);
    }
}
