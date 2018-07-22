package any;

import java.util.Scanner;

abstract public class bank {
	static Scanner sc=new Scanner(System.in);
    String dn, at;
	int ano,bal=0;
	bank(String a,String b, int c,int d)
	{
		dn=a;
		at=b;
		ano=c;
		bal=d;
	}
	void input(){
		System.out.println("Enter name of depositor : ");
		dn = sc.nextLine();
		System.out.println("Enter account number : ");
		ano = sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter account type : ");
		at = sc.nextLine();

	}
	abstract void display();
	abstract void deposit();
	abstract void withdraw();
}
