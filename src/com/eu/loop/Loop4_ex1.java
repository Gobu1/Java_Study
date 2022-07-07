package com.eu.loop;

import java.util.Scanner;

public class Loop4_ex1 
{

	public static void main(String[] args) 
	{
		//0분0초부터 59분59초까지 
		//스캐너를 통해 분과 초를 입력하게 해라
		Scanner sc = new Scanner(System.in);
		System.out.println("몇분");
		int pm = sc.nextInt();
		System.out.println("몇초");
		int sm = sc.nextInt();
		
		for(int m=0; m<60; m++)
		{
			for(int s=0; s<60; s++)
			{
				if (pm==m && sm==s) 
				{
					System.out.println(m+"분"+s+"초");
				}
				
			}
		}
		
	}

}
