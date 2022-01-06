import java.text.SimpleDateFormat;

public class AccountApp {
	
	public static void main(String args[]) {
		int id = 1122;
		double  balance = 20000, interest = 4.5;
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		
		Account myAccount = new Account(id, balance);
		myAccount.setAnnualInterest(interest);
		
		myAccount.withdraw(2500.0);
		myAccount.deposit(3000.0);
		
		System.out.printf("Account Balance: $%.2f%n", myAccount.getBalnce());
		System.out.printf("Monthly Interest: $%.2f%n", myAccount.getMonthlyInterest());
		System.out.println("Date Opened: " + df.format(myAccount.getDateCreated()));
		
		System.exit(0);
	}

}
