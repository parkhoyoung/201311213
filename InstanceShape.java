package com.sd.ch8; 
 
 
 public abstract class InstanceShape{ 
 public String name="Shape"; 
 public abstract double calcArea(); 
 public abstract double calcPerimeter(); 
 public String getName(){ return this.name;} 
 public String toString(){ 
      return "Shape..."+super.toString(); 
      } 
 
 
   public static void main(String args[]){ 
 	 
 	InstanceShape r=new InstanceRectangle(4,5); 
 	InstanceShape c=new InstanceCircle(3); 
 	System.out.println("Rectangle Area: "+r.calcArea()); 
 	System.out.println("Circle Area: "+c.calcArea()); 
 	 
 	 
 	System.out.println(); 
 	if(r instanceof InstanceShape && r instanceof InstanceRectangle){ 
       System.out.println(r.toString()); 
   } 
 
   if(c instanceof InstanceShape&& c instanceof InstanceCircle){ 
       System.out.println(c.toString()); 
   } 
     System.out.println(); 
   if(r.getClass()==InstanceRectangle.class) 
     System.out.println("r.getClass==InstanceRectangle.class is true"); 
      
   if(r.getClass()==InstanceShape.class) 
     System.out.println("r.getClass==InstanceShape.class is true"); 
     else  
     System.out.println("r.getclass==InstanceShape.class is false"); 
      
    
   
     System.out.println(); 
   InstanceShape[] s=new InstanceShape[2]; 
 	s[0]=r; 
 	s[1]=c; 
 	  
 	 for(InstanceShape my:s){ 
     if(my instanceof InstanceRectangle){ 
         System.out.println(my.toString()); 
     }else if(my instanceof InstanceCircle){ 
         System.out.println(my.toString()); 
      } 
   } 
    
   for(InstanceShape my:s)  
     System.out.println(my.toString()); 
      
       
    } 
 } 