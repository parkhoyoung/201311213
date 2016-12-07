package com.sd.io; 

 
 import java.io.*; 
 import java.util.Scanner; 
 
 public class PrintFileNotFound { 
 	 
 	public static void main(String[] args) { 
 		try{ 
 			File f=new File("noname.txt"); 
 	        	FileReader fr=new FileReader(f); 
 		} 
 		catch(FileNotFoundException e){ 
 			System.out.println("File Not Found!!"); 
 		} 
 	} 
 } 
