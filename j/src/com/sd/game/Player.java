package com.sd.game;

public class Player {
    private String name=null;
    public int num1=0;
    public int num2=0;
    public Player(String _name) {
           name=_name;
 }
 public void play() {
     Dice d= new Dice();
     d.roll();
     this.num1=d.getNum();
     d.roll();
     this.num2=d.getNum();
 }
 public String getName() {
       return this.name;
 }
 public int getNum() {
       return this.num1+this.num2;
}
}

