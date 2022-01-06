import java.util.*;

/**
 * 
 * @author Sean Aloysius O'Grady
 *
 */
public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	
	/**
	 * default constructor for account class
	 */
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
		
	}
	
	
	/**
	 * loaded constructor for account class
	 */
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	/**
	 * getId method will return value of account id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * setId will set the id field to the given int value
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * getBalnce will return the val of double field
	 */
	public double getBalnce() {
		return balance;
	}
	
	/**
	 * setBalance will set the balance field to the given double value
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * getAnnualInterest will return the val of AnnualInterest field
	 */
	public double getAnnualInterest() {
		return annualInterestRate;
	}
	
	
	/**
	 * setAnnualInterest will set the interest field to 
	 * the given double and divide by 100 as interest rate 
	 * is given as a percentage
	 */
	public void setAnnualInterest(double annualInterestRate) {
		this.annualInterestRate = (annualInterestRate/100);
	}
	
	/**
	 *getDateCreated returns the date created date field
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
	
	/**
	 * getMontlyInterestRate divides the annual rate by 12 thus 
	 * giving us the interest rate of ea/ month of the year
	 */
	public double getMonthlyInterestRate() {
		return (annualInterestRate/12);
	}
	
	/**
	 * get monthly interest returns the monthly interest 
	 * which is based on the balance currently held 
	 * multiplied by the monthly interest rate itself
	 */
	public double getMonthlyInterest() {
		return (balance * getMonthlyInterestRate());
	}
	
	/**
	 * withdraw removes the specified amount of money from 
	 * the users account
	 * @param withdrawal specifies amount to remove from account
	 */
	public void withdraw(double withdrawal) {
		balance -= withdrawal;
	}
	
	/**
	 * deposit adds the specified amount of money to 
	 * the users account
	 * @param deposit specifies amount to add to account
	 */
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	
	
}
