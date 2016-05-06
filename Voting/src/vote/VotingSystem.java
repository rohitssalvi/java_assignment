package vote;

import java.util.Scanner;

public class VotingSystem {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age=input.nextInt();
		
		if(age>18)
		{
			System.out.println("You are eligible for Vote");
		}
		else
		{
			System.out.println("You are not eligible for Vote");
		}
	}

}
