package com.eu.control;

import java.util.Scanner;

public class Control2_ex2 {
	
	public static void main(String []args) {
		//1
		Scanner sc = new Scanner(System.in);
		System.out.println("1-20사이의 숫자 입력");
		int num = sc.nextInt(); //num:1 => c num:2 => d
		char ch ='a'; // =>b
		int t = (int)ch+num;
		
		if (t>=97 && t<=122) { System.out.println((char)t);
		}
		else if (t>122 || t<97) {t=97+num;
		System.out.println((char)t);
		}
		
		
		/*char sh = sc.next().charAt(0);
		int num = sh+1;
		System.out.println((char)num);*/
		//home
	}
}
