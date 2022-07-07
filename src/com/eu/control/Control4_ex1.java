package com.eu.control;

import java.util.Scanner;

public class Control4_ex1 {

		public static void main(String []args) {
			/*국어 영어 수학 입력
			 * 총점 평균계산 90 - A, 80 - B, 70 - C 60 - D, 그외 F
			 */
			Scanner sc = new Scanner(System.in);
			
			System.out.println("국어 점수");
			int kr = sc.nextInt();
			System.out.println("수학 점수");
			int math = sc.nextInt();
			System.out.println("영어 점수");
			int eng = sc.nextInt();
			int total = (kr+math+eng)/3;
			
			
			switch (total/10) {
			case 10 : 
				System.out.println("A학점=100점");
				break;
			case 9 :
				System.out.println("A학점");
				break;
			case 8 : 
				System.out.println("B학점");
				break;
			case 7 :
				System.out.println("C학점");
				break;
			case 6 : 
				System.out.println("D학점");
				break;
			default : 
				System.out.println("F학점");
			
			}
			
			
		}
}
