import java.util.Scanner;

public class BankAccount {
	
	Scanner in=new Scanner(System.in);

	public BankAccount() {
	}
		
	public BankAccount(double amount) {
		balance=amount;
	}
	
	protected double balance;

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void printData(){
		System.out.println("Normal Bank Account");
		System.out.println("Balance:"+balance);
	}
	
	public String toString() {
		return("Balance:"+balance);
	}

}
