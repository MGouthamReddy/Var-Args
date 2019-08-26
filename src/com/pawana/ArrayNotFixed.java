package com.pawana;

public class ArrayNotFixed {
	
 
	public static void show(int ... a) {
       
	//System.out.println(a.length);  
  for(int i:a) 
	  System.out.println(i);
  }
	public static void main(String ... args) {
		show(12,30,20,60);

	}}


