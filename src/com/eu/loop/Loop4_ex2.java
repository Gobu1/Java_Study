package com.eu.loop;

import java.util.Scanner;

public class Loop4_ex2 
{

	public static void main(String[] args) 
	{
		/* FPS, 탄30발, 탄창3개
		 * 격발할때 "탕" 이라는 프린트 출력
		 * 1. 단발 , 2. 점사 */
		Scanner sc = new Scanner(System.in);
		int x=0;
		
		for (int ca=0; ca<3; ca++)
		{
			System.out.println("1.단발, 2.점사");
			int select = sc.nextInt();
			 if (select==1)
			{
				 for(int am=0; am<30; am++)
				 {
					 System.out.println(ca+"탕");	
				 }

			}	
			 else if(select==2)
			 {
				 for (int am=0; am<10; am++)
				 {
					 System.out.println(ca+"탕탕탕");
				 }
			 }
			 if (ca<2)
			 {
				 System.out.println("재장전");
			 }
			 System.out.println("사격 종료");
		}
		
		
	}

}
