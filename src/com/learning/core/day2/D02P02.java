package com.learning.core.day2;
import java.util.Scanner;
public class D02P02 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<n;i++)
		{
			if(i%2 == 0)
			{
				System.out.println(""+i);
			}
		}
	}
}
