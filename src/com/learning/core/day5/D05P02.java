package com.learning.core.day5;
import java.util.ArrayList;
import java.util.Scanner;
public class D05P02 
{
	public static void main(String[] args)
	{
	ArrayList<String> namesList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	// Add names to the ArrayList
    namesList.add("John");
    namesList.add("Alice");
    namesList.add("Bob");
    namesList.add("Sarah");
    System.out.println("The array list is : "+ namesList);
    String find = scanner.next();
    if(namesList.contains(find))
    {
    	System.out.println("Found");
    }
    else
    {
    	System.out.println("Not Found");
    }
	}
}
