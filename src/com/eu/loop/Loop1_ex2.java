package com.eu.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		/* 1. 1번 대문자, 2번 소문자
		 * 1번이면 A-Z 출력, 2번이면 a - z 출력 */
		//2. 1-10까지의 합 구하기 (반복문)
		//3. 최대 5번까지 로그인 가능, 이후 불능, 로그인 성공시 종료
		//ID,PW 입력하여 로그인 판단(기록 일치 확인)
		
		int select = sc.nextInt();
		int AZ = 0;
		
		switch (select) {
		case 1 : 
			for (AZ='A'; AZ<='Z'; AZ++ ) {
				System.out.println((char)AZ); }
			break;
		case 2 : 	
			for (AZ='a'; AZ<='z'; AZ++ ) {
				System.out.println((char)AZ); }
		}
		//2.
		int i= 1;
		int total=0;
		for(i=1; i<=10; i++) {
			total = total + i;
			
		}
		System.out.println(total);
		
		//3.
		int yid=1234;//ID
		int ypw=5678;//PW
		int t=0;
	
		for(t=0; t<5; t++) 
		{
			switch (t) 
			{
			case 1 : System.out.println("4회 남았습니다"); break;
			case 2 : System.out.println("3회 남았습니다"); break;
			case 3 : System.out.println("2회 남았습니다"); break;
			case 4 : System.out.println("1회 남았습니다"); break;
			}
			System.out.println("ID를 입력하세요");
			int input = sc.nextInt();
			if (input==1234) 
			{
				
				System.out.println("비밀번호를 입력하세요");
				input = sc.nextInt();
				if(input==5678) 
				{
					t=6;
				}
				else 
				{
					System.out.println("다시 시도하십시요");
				}
			}
			else 
			{
				System.out.println("다시 시도하십시오");
			}
		}
		if (t==5) 
		{
			System.out.println("로그인 실패");
		}
		else 
		{
			System.out.println("로그인 확인");
		}
		
			

		
		
	}

}
