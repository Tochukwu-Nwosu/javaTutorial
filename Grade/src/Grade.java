import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		
		double CA, exam, totalScore;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Continous Assement score: ");
		CA = input.nextInt();
		System.out.print("Enter Examination score: ");
		exam = input.nextInt();
		
		totalScore = CA + exam;
		If(totalScore >= 70);{
			System.out.println("A");
		} else if(totalScore >= 60 && totalScore < 70);{
			System.out.println("B");
		} else if(totalScore >= 50 && totalScore < 60);{
			System.out.println("C");
		} else if(totalScore >= 45 && totalScore < 50);{
			System.out.println("D");
		} else if(totalScore >= 40 && totalScore < 45);{
			System.out.println("E");
		} else {
			System.out.println("F");
		}
		
	}

	private static void If(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
