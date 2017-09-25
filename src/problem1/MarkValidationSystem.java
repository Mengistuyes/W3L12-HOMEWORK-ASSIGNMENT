package problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MarkValidationSystem {

	public static void main(String[] args)throws NumberNotBetween0And100Exception {
		Scanner sc=new Scanner(System.in);
			MarkCalc(sc);
	}
	private static void MarkCalc(Scanner sc) throws NumberNotBetween0And100Exception
	{
		boolean dontExitLoop=true;
		double Mark=0.0;
			System.out.println("Please Enter student Mark: ");
		try
		{
			 Mark=sc.nextDouble();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please Enter only number between 1-100,Thanks.\n");
		}
		try
		{		
		if(Mark<0 || Mark>100)
		{
			throw new NumberNotBetween0And100Exception("Please Enter only number between 1-100,Thanks.\n");
		}
		else
		{
			if(Mark>93)
			{
				System.out.print("Your Grade is: A");
			}
			else if(Mark>83)
			{
				System.out.print("Your Grade is: B");
			}
			else if(Mark>70)
			{
				System.out.print("Your Grade is: C");
			}
			else
			{
				System.out.print("Your Grade is: F");
			}
		}

		}
		catch(Exception IME)
		{
			System.out.println(IME.getMessage());
		}
		finally
		{
			System.out.println("\n");
		}
	}

}
