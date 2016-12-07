package com.sd.io;

import java.util.Scanner;

public class CalcAreaMain {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("반지름을 입력 하세요 : ");
	    double r=sc.nextDouble();
	    double area=Math.PI*Math.pow(r,2);
	    System.out.print("r:%.2f area:%.2f",r,area);
	}
}