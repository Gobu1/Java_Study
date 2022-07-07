package com.eu.control;

import java.util.Scanner;

public class Contorl3_ex3 {

	public static void main(String[] args) {
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
		double total = (kr+math+eng)/3;
		
		if (total>=90) {
			System.out.println(total +" A학점");}
		else if(total>=80) {
			System.out.println(total +" B학점");}
		else if(total>=70) {
			System.out.println(total +" C학점");}
		else if(total>=60) {
			System.out.println(total +" D학점");}
		else System.out.println(total +" F학점");
	}
	

}
