package com.example.model;

public class Computer extends Player {

    @Override
    public boolean isStop() {
        return this.getPoints() > 16;
    }
} 
