package com.sd.game;

class Dice {
    private int number = 0;
    public void roll() {
        number = (int) (Math.random() * 6)+1;
       
    }
    public int getNum() {
        return this.number;
    }
}