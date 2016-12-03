package com.sd.ch8; 
 public class Turtle {
   private int nLimbs=4;
   protected String food;
   public void SetFood(String f){
     this.food=f;
    }
    public void eat(){
       System.out.println("Turtle eats"+food);
    }
 }