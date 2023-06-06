import Account.Account;
import Account.ShortTermAccount;

public class Main {
    public static void main(String[] args) {

        String defaultDate = "05.05.2023";

        ShortTermAccount ali = new ShortTermAccount(1000);
        System.out.println(ali.balance);

    }
}
