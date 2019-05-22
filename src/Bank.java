import java.time.LocalDate;

public class Bank implements Balance{

    //instance variables for the class
    private String accountHolder;
    private String accountNumber;
    private LocalDate dateOfOpened;
    private String branchCode;
    private String accountType;
    private double balance;

    public Bank(String accountHolder, String accountNumber, LocalDate dateOfOpened,
                String branchCode, String accountType, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.dateOfOpened = dateOfOpened;
        this.branchCode = branchCode;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDate getDateOfOpened() {
        return dateOfOpened;
    }

    public void setDateOfOpened(LocalDate dateOfOpened) {
        this.dateOfOpened = dateOfOpened;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountHolder :" + accountHolder + "\nAccountNumber :" + accountNumber + "\nDateOfOpened :"
                + dateOfOpened + "\nBranchCode :" + branchCode + "\nAccountType :" + accountType +"\nBalance : "+ balance;
    }

    //Overriding the calbalance method
    @Override
    public double calBalance() {

        return balance;
    }


}
