package com.eu.loop;

import java.util.Scanner;

public class Loop5_ex1 
{

	public static void main(String[] args) 
	{
		//id,pw입력 로그인판단 로그인성공 종료
		//실패시 다시입력
		Scanner sc = new Scanner(System.in);
		int yId=1234;
		int yPw=5678;
		boolean check=true;
		while(check)
		{
			System.out.println("로그인을 시도 하시겠습니까? \n1.예, 2.아니오");
			int input=sc.nextInt();
			if (input==1)
			{

				System.out.println("ID를 입력해주세요");
				input = sc.nextInt();
				if (input==yId)
				{
					System.out.println("PW를 입력해주세요");
					input = sc.nextInt();
					if (input==yPw)
					{
						System.out.println("로그인 성공");
						check=!check;
					}
					else System.out.println("비밀번호가 올바르지 않습니다");
				}
				else System.out.println("ID가 올바르지 않습니다.");

			}
			else
			{
				check=false;
			}
		}
		//로그인이 안되있을시 프로그램 종료
		//로그인에 성공했을시 게임 시작
		//시작레벨 1 => 만렙 15 , gold : 1000 5레벨 달성시 1000골드 지급
		//10레벨 2000골드 15레벨 3000 골드
		//모든 몬스터의 경험치는 동일, 
		//레벨1->2 :3마리, 2->3 :6마리, 3->4 :9마리 .... 

		if (check==false)
		{
			System.out.println("게임 실행");
			int exp=0;
			int gold=1000;
			for (int lv=1; lv<16; lv++)
			{		
				System.out.println("사냥 시작\n1.시작 2.종료");
				int start = sc.nextInt();
				if (start==1)
				{
					for(exp=1; exp<=lv*3; exp++)
					{
					}
					System.out.println("사냥 x "+(lv*3-3)); 
					System.out.println("레벨업 레벨 - "+lv);
					if(lv%5==0)
					{
						System.out.println(lv+"레벨업 보상 +1000골드");
						gold=gold +(lv/5)*1000;
					}
				
				if (lv==15)
				{
					System.out.println("만렙 달성");
					System.out.println("현제레벨"+lv+"\n현재골드"+gold);
				}
				}
				else{
					System.out.println("사냥 종료");
					System.out.println("현제레벨"+(lv-1)+"\n현재골드"+gold);
					break;
				}
			}
		}
		else System.out.println("프로그램 종료");

	}

}

//switch(lv)
//{
//case 5 :
//	System.out.println("5레벨업 보상");
//	gold=gold +(lv/5)*1000;
//	break;
//case 10 :
//	System.out.println("5레벨업 보상");
//	gold=gold +(lv/5)*1000;
//	break;
//case 15 :
//	System.out.println("5레벨업 보상");
//	gold=gold +(lv/5)*1000;
//	break;
//}