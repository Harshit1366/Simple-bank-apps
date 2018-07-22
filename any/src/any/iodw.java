package any;

import java.util.Scanner;

public class iodw extends bank {
	static Scanner sc = new Scanner(System.in);
	iodw(String a,String b, int c,int d)
	{
		super(a,b,c,d);
	}
	void display() {
		System.out.println("\nDETAILS :-\nDepositor's name : " + dn + "\nBalance : Rs. "+bal+"/-");
	}
	
	void deposit()
	{
	System.out.println("Account Balance : Rs. "+bal+"/-");
	System.out.println("Enter deposit amount : Rs. ");
	int dep=sc.nextInt();
	bal=bal+dep;
	}
	
	void withdraw()
	{
		System.out.println("Account Balance : Rs. "+bal+"/-");
		System.out.println("Enter amount of money you wish to withdraw : Rs. ");
		int w=sc.nextInt();
		System.out.println("\nChecking balance ... \n ");
		if(bal<=0)
			System.out.println("Can't withdraw money! you don't have enough balance...");
		else if(w<bal)
		{
		System.out.println("Balance more than withdrawal money. Money withdrawn!");
		bal=bal-w;
		}
		else
		{
			System.out.println("ERROR! Money withdrawn is greater than deposited money! Enter amount less than balance !");	
			withdraw();
		}
	}
}
