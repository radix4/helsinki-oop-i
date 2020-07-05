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


    }

}
