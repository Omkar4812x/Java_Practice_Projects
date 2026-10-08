public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber=accountNumber;
        this.accountHolderName= accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }


    public void deposite(double amount)
    {
        if(amount>0)
        {
            balance = balance + amount;
            setBalance(balance);
        }
    }

    public void withdraw(double amount)
    {
        if(balance >= amount && amount > 0 )
        {
            balance = balance - amount;
            setBalance(balance);
        }
    }

    public void displayAccount(){
        System.out.println("Account Number : "+getAccountNumber());
        System.out.println("Holder Name : "+getAccountHolderName());
        System.out.println("Balance : "+getBalance());
    }



}
