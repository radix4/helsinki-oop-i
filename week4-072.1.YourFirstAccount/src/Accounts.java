
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

        //Create an account w/ balance of 100.0
        Account firstAccount = new Account("First account", 100.0);

        // Deposit 20.0 to firstAccount
        firstAccount.deposit(20.0);

        //Print the account
        System.out.println("Final State");
        System.out.println(firstAccount);
    }

}
