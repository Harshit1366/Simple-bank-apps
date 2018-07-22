package bank;

import java.util.Scanner;

public class account {
	static Scanner sc = new Scanner(System.in);
	String cn, an, at;
	int ano;

	void cheque() {
		System.out.println("CHEQUE FACILITY!");
	}

	void deposit() {
		System.out.println("DEPOSIT MONEY!");
	}

	void interest() {
		System.out.println("INTEREST CHECK!");
	}

	void withdrawal() {
		System.out.println("WITHDRAW MONEY!");
	}

	void min() {
		System.out.println("MINIMUM AMOUNT CHECK!");
	}

	void display() {
		System.out.println("DISPLAY AMOUNT!");
	}

	void input() {

		System.out.println("Enter customer's name : ");
		cn = sc.nextLine();
		System.out.println("Enter account name : ");
		an = sc.nextLine();
		
		System.out.println("Enter account no : ");
		ano = sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter account type (savings/current) : ");
			at = sc.nextLine();

	}

	void show() {
		System.out.println("\nDETAILS :-\nCustomer's name : " + cn + "\nAccount name : " + an + "\nAccount No. : " + ano
				+ "\nAccount type : " + at);
	}

	public static void main(String args[]) {

		account a = new account();
		savings s = new savings();
		current c = new current();
		a.input();
		a.show();
		int b;
		if ("savings".equals(a.at)) {

			System.out.println("MENU :-\n1. DEPOSIT MONEY \n 2. WITHDRAW MONEY \n3. CHECK INTEREST \n4. EXIT\n");
			
			do {
				System.out.println("Enter choice : ");
				b = sc.nextInt();
				switch (b) {
				case 1:
					s.deposit();
					break;
				case 2:
					s.withdrawal();
					break;
				case 3:
					s.interest();
					break;
				case 4:
					System.out.println("THANKYOU FOR ACCESSING OUR SOFTWARE!");
					System.exit(0);
				default:
					System.out.println("Wrong Choice!");
				}
			} while (b != 4);
		} else if ("current".equals(a.at))
			c.cheque();

	}
}
