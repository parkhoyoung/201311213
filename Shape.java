package com.sd.ch8; 

 
 public abstract class Shape{ 
   public String name="Shape"; 
   public abstract double calcArea(); 
   public abstract double calcPerimeter(); 
   public String getName(){ return this.name;} 
   public String toString(){ 
       return "Shape..."+super.toString(); 
      } 
 

   public static void main(String args[]){ 
 	Rectangle r=new Rectangle(4,5); 
 	Circle c=new Circle(3); 
 	System.out.println("Rectangle Area: "+r.calcArea()); 
 	System.out.println("Circle Area: "+c.calcArea()); 
   } 
 } 
