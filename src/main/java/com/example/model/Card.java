package com.example.model;

public class Card {
    private int number;
    private Suit suit;

    public Card(int number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }
    
    public int getNumber() {
        return this.number;
    }

    public Suit getNaipe() {
        return this.suit;
    }

    public String imagePath() {
        String cardNumber = this.number + "";
        if (number == 1) cardNumber = "Ace";
        if (number == 11) cardNumber = "Jack";
        if (number == 12) cardNumber = "Queen";
        if (number == 13) cardNumber = "King";
        return "/com/example/classic-cards/" + cardNumber + this.suit + ".png";
    }

}
