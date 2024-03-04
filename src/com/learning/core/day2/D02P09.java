package com.learning.core.day2;
import java.util.*;
public class D02P09 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for(int i =1;i<=a;i++)
		{
			int temp =  i*i*i;
			System.out.println(temp);
		}
	}
}
