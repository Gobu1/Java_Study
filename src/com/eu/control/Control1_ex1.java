package com.eu.control;

import java.util.Scanner;

public class Control1_ex1 {
	
	public static void main(String []args) {
		/* 키보드로부터 국어 영어 수학점수를 차레로 입력
		 * 총점 평균을 계산, 평균이 90점 이상이면 우등상 수상 출력
		 * 모든 학생들은 졸업 출력 */
		/* 90점 이상일 경우 A를 출력, 80점 이상일 경우 B를 출력
		 * 70점 이상일 경우 C를 출력, 60점 이상일 경우 D를 출력
		 * 그 외에 나머지는 F를 출력 */
		Scanner sc = new Scanner(System.in);
		int kr = 0;
		int math = 0;
		int eng = 0;
		
		System.out.println("국어 점수를 입력하세요");
		kr = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng = sc.nextInt();
		
		double total = (kr + math + eng)/3;
		if(total>90) {System.out.println("우등상 수상 축하드립니다.");}
		else System.out.println("졸업 축하드립니다");
		
		if(total>=90) {System.out.println(total +"  A학점"); }
		if(total<90 && total>=80) {System.out.println(total +"  B학점");}
		if(total<80 && total>=70) {System.out.println(total +"  C학점");}
		if(total<70 && total>=60) {System.out.println(total +"  D학점");}
		else {System.out.println(total +"  F학점");}
	}
}
