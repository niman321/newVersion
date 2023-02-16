package Class26;

public class Account {
    private double balance;
    private String accountNumber;
    private String type;
    private String accountTitle;

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length()!= 16) {
            System.out.println("wrong accountNumber");
        } else {
            this.accountNumber = accountNumber;
        }


    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("not allowed current account");
        } else {
            this.balance = this.balance + balance;
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountTitle() {
        return accountTitle;
    }


    public Account(double balance, String accountNumber, String type, String accountTitle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountTitle = accountTitle;
    }

    public double getBalance() {
        return balance;
    }
}


class AccountTester {
    public static void main(String[] args) {
        Account account = new Account(100000, "554512121", "savings", "Mr john");
        account.setBalance(644646);
        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountTitle());
        System.out.println(account.getBalance());
    }


}
