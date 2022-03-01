// This program computes grades by taking in continuous assessment and examination score as inputs

import java.util.Scanner;

public class Result 
{
	public static void main(String[] args) 
	{
		
		double CA, exam, totalScore;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Continuous Assessment score: ");
		CA = input.nextInt();
		System.out.print("Enter Examination score: ");
		exam = input.nextInt();
		
		totalScore = CA + exam;
		if(totalScore >= 70)
		{
			System.out.println("Grade: A");
		} 
		else if(totalScore >= 60 && totalScore < 70)
		{
			System.out.println("Grade: B");
		} 
		else if(totalScore >= 50 && totalScore < 60)
		{
			System.out.println("Grade: C");
		} 
		else if(totalScore >= 45 && totalScore < 50)
		{
			System.out.println("Grade: D");
		} 
		else if(totalScore >= 40 && totalScore < 45)
		{
			System.out.println("Grade: E");
		} 
		else
		{
			System.out.println("Grade: F");
		}
	}
}
