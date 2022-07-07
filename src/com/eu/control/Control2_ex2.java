package com.eu.control;

import java.util.Scanner;

public class Control2_ex2 {
	
	public static void main(String []args) {
		//1
		Scanner sc = new Scanner(System.in);
		System.out.println("1-25사이의 숫자 입력");
		int num = sc.nextInt(); //num:1 => c num:2 => d
		char ch ='A'; // =>b
		int t = (int)ch+num;
		
		/*if (t>=97 && t<=122) { System.out.println((char)t);
		}*/
		//소문자가 범위를 벗어낫을때
		if (t>'z') {
			t = t - 122-1;
			t = 96 + t;
		}
		ch = (char)t;
		System.out.println((char)(ch));
		
		//대문자가 범위를 벗어났을때
		if(t>'A' && t<'a') {
			t = t - 'Z'-1;
			t = 'A' + t ;			
		}
		ch = (char)t;
		System.out.println(ch);

	}
}