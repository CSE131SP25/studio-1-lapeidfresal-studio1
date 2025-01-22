package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number one: ");
		int num1 = in.nextInt();
		System.out.print("Enter number two: ");
		int num2 = in.nextInt();
		int sum = num1 + num2;
		System.out.print("The average is " + (double)sum/2);
	}
	
		
	

}
