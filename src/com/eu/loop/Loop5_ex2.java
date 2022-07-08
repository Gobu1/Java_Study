package com.eu.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 
{
	public static void main(String []args)
	{
		//System.out.println(num);c
		//nextInt(정수) : 0부터 입력한 정수 미만 범위에서 무작위 정수 출력
		
		//0 : 가위, 1 : 주먹, 2 : 보
		
//			if (me==0)
//			{
//				if(num==0)		{System.out.println("컴퓨터 가위\t비겼습니다. 다시.");}
//				else if(num==1)	{System.out.println("컴퓨터 바위\t졋습니다. 다시");}
//				else			{System.out.println("컴퓨터 보	 \t이겼습니다."); x=false;}
//			}
//			if (me==1)
//			{
//				if(num==0)		{System.out.println("컴퓨터 가위\t이겼습니다."); x=false;}
//				else if(num==1)	{System.out.println("컴퓨터 바위\t비겼습니다. 다시.");}
//				else			{System.out.println("컴퓨터 보	 \t졋습니다. 다시");}
//			}
//			if (me==2)
//			{
//				if(num==0)		{System.out.println("컴퓨터 가위\t졋습니다. 다시");}
//				else if(num==1)	{System.out.println("컴퓨터 바위\t이겼습니다."); x=false;}
//				else			{System.out.println("컴퓨터 보	 \t비겼습니다. 다시.");}
//			}
//			if (me>num) {System.out.println("이겼습니다");
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		boolean x=true;
		while (x)
		{
			int num = random.nextInt(3);
			System.out.println("가위바위보를 시작합니다. \n 0. 가위 1.주먹 2.보");
			int me = sc.nextInt();
			if ((me==1&&num==0) || (me==2&&num==1) || (me==0&&num==2) )
			{
				System.out.println("승리하였습니다.");
				x=false;
			}
			else if (me==num)
			{
				System.out.println("비겼습니다");
			}
			else System.out.println("졌습니다.");
		}
		
	}

}
