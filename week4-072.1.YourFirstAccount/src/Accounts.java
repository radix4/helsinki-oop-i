/**
 * This program
 * @author  Thang Cao
 * @since   07/05/2020
 * */


import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account account = new Account("Thang",100);
        account.deposit(20);

        System.out.println(account);
    }

}
