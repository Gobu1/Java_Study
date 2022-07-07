package com.eu.loop;

import java.util.Scanner;

public class Loop_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//0 - 9 출력하는 반복문, 단 출력은 짝수만 출력
		int i = 0;
		for (i=0; i<10; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}	
		}
		System.out.println("===========");
		//if, swtich, 3항 불가
		for (i=0; i<10; i=i+1) { 
			System.out.println(i);
			i++;
			
		}
		System.out.println("===========");
		//멍멍 출력 , 출력횟수 입력받아야한다
		int t=sc.nextInt();
		for (t=0; t<20; t++ ) {
			System.out.println("멍멍");
		}
		

	}

}
