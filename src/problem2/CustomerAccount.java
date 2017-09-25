package problem2;

import java.util.Random;
import java.util.Scanner;

public class CustomerAccount {
	private String Cus_name;
	private String Acc_No;
	private Double Balance;
	CustomerAccount(String Cus_name,String Acc_No,Double Balance)
	{
		this.Cus_name=Cus_name;
		this.Acc_No=Acc_No;
		this.Balance=Balance;
	}
	void deposit(Double deposit){
		this.Balance=this.Balance+deposit;
		System.out.println("Your Current balance after depositing " + deposit + " is " + this.Balance );
	}
	void Withdraw(Double withdrawAmount) throws BalanceException
	{
		try
		{
			if(this.Balance<withdrawAmount)
			{
				throw new BalanceException("Insufficient Balance");
			}
			else if(this.Balance-withdrawAmount<100)
			{
				throw new BalanceException("Your account cannot be less than Minimum Balance($100)");
			}
			else
			{
				this.Balance=this.Balance-withdrawAmount;
				System.out.println("Your available Balance is  " + this.Balance);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args) throws BalanceException {
	
		boolean NotExit=true;
		
	while(NotExit){
		Scanner s=new Scanner(System.in);
		int To=500000000;
		int From=600000000;
		System.out.println("\n");
		System.out.println("____________Welcome to Mengistu Bank!_____________\n");
		Random r = new Random();
		
		String[] name={"Mengistu","Messi","Abebe","Seble","Addis","Teddy","Helen","Dawit","Timint","Ephrem","Tedla","Elias"};
		int index=r.nextInt(11-0);
		
		Double BA=(double)r.nextInt((10000 - 3500));
		String AC=50001+ "" + r.nextInt((From - To))+"";
		System.out.println("Your randomlly generated Name is: " + name[index]);
		System.out.println("Your randomlly generated Balance: " + BA);
		System.out.println("Your randomlly generated Account: " + AC + "\n");
		System.out.println("To deposit money press 'd'");
		System.out.println("To withdraw money press 'w'");
		
		CustomerAccount ca1=new CustomerAccount("Mengistu",AC,BA);
		
		String userInput=s.nextLine();
		if(userInput.equalsIgnoreCase("w"))
		{
			System.out.println("Please Enter your withdraw Amount ");
			Double wd=s.nextDouble();
			ca1.Withdraw(wd);
		}
		else if(userInput.equalsIgnoreCase("d"))
		{
			System.out.println("Please Enter your deposit Amount ");
			Double dp=s.nextDouble();
			ca1.deposit(dp);
		}
		
		else
		{
			System.out.println("Please Enter only w/d");
		}
	
	System.out.println("Do you want to continue y/n");
	String yesOrNo=s.next();
	if(yesOrNo.equalsIgnoreCase("n"))
	{
		System.out.println("Thanks for using our system!");
		break;
	}
	else
	{
	}
	}
 }
}
