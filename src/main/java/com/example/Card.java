package com.example;

public class Card {
    private int number;
    private Naipe naipe;

    public Card(int number, Naipe naipe) {
        this.number = number;
        this.naipe = naipe;
    }
    
    public int getNumber() {
        return this.number;
    }

    public Naipe getNaipe() {
        return this.naipe;
    }

    public String imagePath() {
        return "classic-cards/" + this.number + this.naipe + ".png";
    }
}
