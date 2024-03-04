package com.learning.core.day2;
import java.util.*;
public class D02P08 
{
	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	int a= scanner.nextInt();
	int b = scanner.nextInt();
	int res=0;
	for(int i=a;i<=b;i++)
	{
		res= res+i;
	}
	System.out.println(res);
	}
}
