package com.example.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mountain {
    private List<Card> cards = new ArrayList<>();

    public Mountain() {
        for (int number = 1; number <= 13; number++) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(number, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card flip() {
        return cards.remove(0);
    }
}
