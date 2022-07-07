package com.eu.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
//		정수입력 단일if 한번사용, 짝수 홀수 출력
		Scanner sc = new Scanner(System.in);
		
		String result="홀수입니다";
		
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		if(num%2==0) { result="짝수입니다";
		}
		System.out.println(result);
		

	}

}
