import java.util.*;
public class Main {
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        do{

            System.out.println("================================");
            System.out.println("        BANK MANAGEMENT        ");
            System.out.println("================================");

            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account");
            System.out.println("0. Exit");
            System.out.println("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter Account Number : ");
                    int accountNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Holder Name : ");
                    String accountHolderName = sc.nextLine();
                    System.out.println("Enter Balance : ");
                    double balance = sc.nextDouble();

                    Account account = new Account(accountNumber,accountHolderName,balance);
                    bank.createAccount(account);

                    break;

                case 2:
                    System.out.println("Enter Account Number :");
                    accountNumber = sc.nextInt();
                    System.out.println("Enter Amount : ");
                    double amount = sc.nextDouble();
                    bank.deposit(accountNumber,amount);
                    break;

                case 3:

                    System.out.println("Enter Account Number :");
                    accountNumber = sc.nextInt();
                    System.out.println("Enter Amount : ");
                    amount = sc.nextDouble();
                    bank.withdraw(accountNumber,amount);
                    break;

                case 4:
                    System.out.println("Enter Account Number :");
                    accountNumber = sc.nextInt();
                    bank.display(accountNumber);
                    break;

                case 5:

                    System.out.println("Enter Account Number :");
                    accountNumber = sc.nextInt();
                    bank.dispalyAccount(accountNumber);

                    break;

                case 0:

                    System.out.println("Thank You...");
                    System.exit(0);
                    break;
            }


        }while(true);
    }
}
