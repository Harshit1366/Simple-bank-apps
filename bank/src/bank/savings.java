package bank;
import java.util.Scanner;
public class savings {

	public static int bal=0;

	Scanner sc=new Scanner(System.in);
	void deposit()
	{
	System.out.println("Account Balance : Rs. "+bal);
	if(bal<=0)
	System.out.println("MINIMUM DEPOSIT : Rs. 1000/-");
	System.out.println("Enter deposit amount : Rs. ");
	int dep=sc.nextInt();
	if(dep<1000)
	{
		System.out.println("enter>1000");
	    deposit();
	}
	bal=bal+dep;
	display();
	
	}
	
	void display()
	{
	System.out.println("Updated balance : Rs. "+bal+"/-");
	}
	
	void interest()
	{
		double r=0.05;
		System.out.println("INTEREST RATE : 5% per annum");
		System.out.println("Enter time in no. of years : ");
		int y=sc.nextInt();
		double intr=bal*(Math.pow((1+r),y));
		System.out.println("Interest Amount : Rs. "+intr+"/-");
		System.out.println("Overall Balance after "+y+"years : Rs. "+(bal+intr)+"/-");
	}
	
	void withdrawal()
	{
		System.out.println("Enter amount of money you wish to withdraw : Rs. ");
		int w=sc.nextInt();
		if(w<bal)
		{
		System.out.println("Money withdrawn!");
		bal=bal-w;
		display();
		}
		else
			System.out.println("ERROR! Money withdrawn is greater than deposited money!");	
	}
	
	
	
}
