public abstract class Shape {
      public String name="Shape";
      public abstract double calcArea();
      public abstract double calcPerimeter();
      public String getName(){
         return this.name;
      }
      public String toString()
      {
        return "Shape...";
       }
}
package com.sd.ch8;

public class Rectangle extends Shape {
       private double width,height,area,perimeter;
       public Rectangle(double width, double height) {
              this.width=width;
              this.height=height;
              this.area=width*height;
              this.perimeter=2*(width+height);
         }
        public double calcArea() {
              return this.area;
       }
        public double calcPerimeter() {
              return this.perimeter;
        }
        public String toString() {
              return "Rectangle..."+super.toString();
        }
        public static void main(String[] args){
           Rectangle r=new Rectangle(3,4);
           r.calcArea();
      }
}
