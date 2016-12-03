package com.sd.ch8; 
 
 
 public class Hello{ 
     private String name; 
     public Hello(String name){ 
         this.name=name; 
     } 
     public void sayHello(){ 
         System.out.println("hello "+name); 
      } 
    
   public static void main(String args[]){ 
       Hello[] h=new Hello[3]; 
        
       h[0]=new Hello("jsl1"); 
       h[1]=new Hello("jsl2"); 
       h[2]=new Hello("jsl3"); 
    
        
       for(int i=0;i<3;i++) 
         System.out.println(h[i]); 
        System.out.println(); 
        
       for(int i=0;i<h.length;i++) 
          h[i].sayHello(); 
        System.out.println(); 
         
       for(Hello e:h) 
         e.sayHello(); 
     } 
 } 
