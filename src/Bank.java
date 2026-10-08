import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(Account bank)
    {
        accounts.add(bank);
    }

    public void deposit(int acid,double amount)
    {
        for(Account account : accounts)
        {
            if(account.getAccountNumber() == acid)
            {
                account.deposite(amount);
                System.out.println("Amount deposite successfully...");
                return;
            }
        }
        System.out.println("Account not found...");
    }

    public void withdraw(int acid , double amount){
        for(Account account : accounts)
        {
            if(account.getAccountNumber() == acid)
            {
                account.withdraw(amount);
                System.out.println("Amount Withdraw successfully...");
                return;
            }
        }
        System.out.println("Account not found...");

    }

    public void display(int acid)
    {
        for(Account account : accounts)
        {
            if(account.getAccountNumber() == acid)
            {
                System.out.println("Balace : "+account.getBalance());
                return;

            }
        }
        System.out.println("Account not found");
    }

    public void dispalyAccount(int acid)
    {
        for(Account account : accounts)
        {
            if(account.getAccountNumber() == acid)
            {
                account.displayAccount();
                return;
            }
        }
        System.out.println("Account Not found...");
    }

}
