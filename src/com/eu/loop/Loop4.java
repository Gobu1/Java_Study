package com.eu.loop;

public class Loop4 
{
	public static void main(String[] args)
	{
//		for(int i=2; i<10; i++)
//		{
//			for(int j=1; j<10; j++)
//			{
//				System.out.println(i+"x"+j+ "="+ i*j);
//			}
//		}
//		for(int i=0; i<3; i++)
//		{
//			for(int j=0; j<5; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0; i<5; i++)
//		{
//			for(int j=i; j<5; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i=1; i<10; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(i>j)
				{
				System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
