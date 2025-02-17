package com.example;

public class Computer extends Player {

    @Override
    public boolean isStop() {
        return this.getPoints() > 16;
    }
} 
