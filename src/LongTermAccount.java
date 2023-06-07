
public class LongTermAccount extends Account {

    public LongTermAccount(int balance, int createID) {
        super(balance, createID);
    }

    @Override
    public void benefit() {
        if (balance >= 1500) {
            balance = balance * 24 / 100 + balance;
        }
    }
}