package com.eu.control;

public class Contorl2_ex1 {

	public static void main(String[] args) {
		/* 월급입력
		1. 정규직 2. 계약직  [월급 400만원]
		정규직 - 국민연급 1%, 건강보험 1.4%, 고용보험 0.5% 산재보험 0.7%
		계약직 - 국민연금 3.3%
		*/
		int class1 = 1;
		int pay = 4000000;
		double tax1 = (pay)-(pay*0.036);
		double tax2 = (pay)-(pay*0.033);
		if(class1==1) {
			System.out.println("정규직입니다");
			System.out.println((int)tax1+"원");
		}
		else {
			System.out.println("계약직입니다.");
			System.out.println((int)tax2+"원");
		}
		
		
		
	}
            
}
