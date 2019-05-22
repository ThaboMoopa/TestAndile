import java.time.LocalDate;

public class Savings extends Bank implements Balance {

	//
	private double amount;


	
	public Savings(String accountHolder, String accountNumber, LocalDate dateOfOpened, String branchCode,
			String accountType, double amount, double balance) {
		super(accountHolder, accountNumber, dateOfOpened, branchCode, accountType,balance);
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	//Overriding the calcBalance method
	@Override
	public double calBalance() {

		return super.getBalance() + amount;
	}

	@Override
	public String toString() {
		return "\n"+ super.toString() + "\nAmount Deposited :" + getAmount() + "\nBalance after deposite amount :" + calBalance();
	}
	
}
