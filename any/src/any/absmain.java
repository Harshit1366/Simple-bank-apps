package any;
import java.util.Scanner;
public class absmain {
static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int b;
		iodw o = new iodw(null,null,0,0);
		System.out.println("Enter details : \n");
		o.input();
		System.out.println("MENU : \n 1. DEPOSIT MONEY \n 2. WITHDRAW MONEY \n 3. ACCOUNT DETAILS \n 4. EXIT \n");
		do{
			System.out.println("Enter choice : ");
			b=sc.nextInt();
			switch(b)
			{
			case 1:
				o.deposit();
				break;
			case 2 :
				o.withdraw();
				break;
			case 3:
				o.display();
				break;
			case 4 :
				System.out.println("THANKS FOR ACCESSING US!");
				break;
			default:
			    System.out.println("Wrong choice!");	
			}
		}while(b!=4);
	}
}
