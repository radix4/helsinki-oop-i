
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

        //create 2 accounts
        Account firstAccount = new Account("Matt's account", 1000);
        Account secondAccount = new Account("My account", 0);

        firstAccount.withdrawal(100);
        secondAccount.deposit(100);

        System.out.println(firstAccount);
        System.out.println(secondAccount);
    }

}
