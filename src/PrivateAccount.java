
public class PrivateAccount extends Account {

    public PrivateAccount(int balance, int createID) {
        super(balance, createID);
    }

    @Override
    public void benefit() {

        balance = balance * 12 / 100 + balance;

    }
}