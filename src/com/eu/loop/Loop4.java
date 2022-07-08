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
	/*	for(int i=1; i<10; i++)
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
			System.out.println();*/
	/*	for(int i=0; i<6; i++)
		{
			for(int j=0; j<5-i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0; j<i*2+1; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
				
		}*/
		int x=5;
		for (int i=0; i<9; i++)
		{
			if (i<5)
			{
				for (int j=0; j<5-i; j++)
				{
					System.out.print(" ");
				}	
				for (int j=0; j<2*i+1; j++)
				{
					System.out.print("*");
				}
			}
			if (i>=5)
			{
				x--;
				for (int j=0; j<i-3; j++)
				{
					System.out.print(" ");
				}
				for (int j=0; j<2*x-1; j++)
				{
					System.out.print("*");
				}

			}
		System.out.println("");
		}
	}
}
