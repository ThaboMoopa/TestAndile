import java.time.LocalDate;

public class Withdrawal extends Bank implements Balance{
	//
	private double amount;
	
	public Withdrawal(String accountHolder, String accountNumber, LocalDate dateOfOpened,
			String branchCode,String accountType, double amount, double balance) {
		super(accountHolder, accountNumber, dateOfOpened, branchCode, accountType, balance);
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	//Overriding the calculate 
	@Override
	public double calBalance() {
		
		return super.calBalance()- amount;
	}
	@Override
	public String toString() {
		return ""+ super.toString()+ "Amount withdrawn is :" + getAmount() + "Amount after withdrawls :"+ calBalance();
	}	
}
