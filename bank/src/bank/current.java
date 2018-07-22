package bank;

public class current extends account {
	savings s = new savings();
	void cheque()
	{
	System.out.println("This account provides the cheque-book facility!");
	System.out.println("Your current balance is : Rs. "+savings.bal+"/-");
	if(savings.bal < 1000)
				min();
	System.out.println("Do you wish to deposit amount?(1/0)");
	int a=sc.nextInt();
	if(a==1)
		s.deposit();
	if(savings.bal<5000)
		System.out.println("You are not permitted to access this facility!");
	else
		System.out.println("You can access this facility!");
	System.out.println("Thanks for accessing this facility!");
	}
	
	void min()
	{
            System.out.println("Your balance "+savings.bal+" is less than the required needs(Rs. 1000/- minimum) !");
			System.out.println("PENALTY IMPOSED : Rs. 500/-");
			System.out.println(" Deposit amount Rs. "+(1000-savings.bal)+" in bank !");
			s.deposit();
			savings.bal=savings.bal-500;
			System.out.println("Updated Balance after penalty charges : "+savings.bal);
	}
	
}
