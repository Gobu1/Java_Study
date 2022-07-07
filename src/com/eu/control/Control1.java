package com.eu.control;

import java.util.Scanner;

class Control1 {

	public static void main(String[] args) {
		/*제어문
		 * 1. 단일1f문 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+"\t짝수입니다");
		}
		else { System.out.println("홀수입니다");
		}
		if(num<10) {System.out.println("10 미만");
		}
		else { System.out.println("10 이상");
		}
		

	}

}
