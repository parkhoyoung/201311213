package com.sd.ch8; 
 
 
 public class InstanceCircle extends InstanceShape{ 
     private final double radius,area,perimeter; 
      
     public InstanceCircle(double radius){ 
       this.radius=radius; 
       this.area=Math.PI*radius*radius; 
       this.perimeter=2*Math.PI*radius; 
       } 
     public double calcArea(){ 
         return this.area; 
     } 
     public double calcPerimeter(){ 
         return this.perimeter; 
     } 
     public String toString(){ 
         return "Circle..."+super.toString(); 
     } 
 } 
