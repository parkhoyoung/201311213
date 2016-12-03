package com.sd.ch8; 
 
 
 public class InstanceRectangle extends InstanceShape{ 
   private final double width,height,area,perimeter; 
    
   public InstanceRectangle(double width,double height){ 
     this.width=width; 
     this.height=height; 
     this.area=width*height; 
     this.perimeter=2*(width+height); 
     } 
    public double calcArea(){ 
         return this.area; 
    } 
    public double calcPerimeter(){ 
         return this.perimeter; 
    } 
    public String toString(){ 
         return "Rectangle..."+super.toString(); 
    } 
} 
