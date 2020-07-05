/**
 * This program
 * @author  Thang Cao
 * @since   07/05/2020
 * */


import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        /** Exercise 72.1 */
        Account account = new Account("Thang",100);
        account.deposit(20);

        /** Exercise 72.2 */
        Account secondAccount = new Account("Matt's account",1000);
        Account myAcc = new Account("My account", 0);
        secondAccount.withdrawal(100.0);
        myAcc.deposit(100.0);
        System.out.println(secondAccount);
        System.out.println(myAcc);

        /** Exercise 72.3 */
        Account A = new Account("A", 100.0);
        Account B = new Account("B", 0.0);
        Account C = new Account("C", 0.0);

        transfer(A, B, 50);
        transfer(B, C, 25);
    }

    public static void transfer(Account form, Account to, double amount) {
        form.withdrawal(amount);
        to.deposit(amount);
    }

}
