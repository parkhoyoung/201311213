package com.hy.ch8;

public class Selection{
 static ArrayList<Rectangle> sArr=new ArrayList<Rectangle>();
 Selection(){}
 public void select(Rectangle r){
 r.setSelected(true);
 sArr.add(r);
 System.out.println("selected:"+r.isSelected);
 }
 public static void main(String[] args){
  Selection s = new Selection();
  for(Rectangle r:sArr)
   System.out.print(r.toString());
 }
}