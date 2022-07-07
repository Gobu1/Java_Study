package com.eu.loop;

public class Loop1 {

	public static void main(String[] args) {
		System.out.println("start");
		
		//for(초기식;조건식;증감식;){}
		for(int i=0; i<5; i++) { //i++ => i=i+1
		System.out.println("Hello world");
		}
		int count = 0;
		for(int i=0;i<10; i++) {
			System.out.println(count);
			count++;
		}
		
		
	}

}
