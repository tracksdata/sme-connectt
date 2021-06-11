package com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			
			System.out.println("Enter a class name: ");
			String cn=sc.next();
			// how can you create object to the class which is in cn variable?
			Class clName = Class.forName(cn);
			
			System.out.println(clName);
			
			clName.newInstance(); // creates object
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
