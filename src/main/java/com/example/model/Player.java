package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int points = 0;
    private List<Card> cards = new ArrayList<>();
    private boolean stop = false;

    public Card receiveCard(Card card) {
        this.cards.add(card);
        this.points += card.getNumber();
        return card;
    }

    public void stop() {
        this.stop = true;
    }
    
    public int getPoints() {
        return this.points;
    }

    public List<Card> getCards() {
        return this.cards;
    }
    
    public boolean isStop() {
        return this.stop;
    }
}
