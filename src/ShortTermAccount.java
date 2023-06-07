
public class ShortTermAccount extends Account {

    public ShortTermAccount(int balance, int createID) {
        super(balance, createID);
    }

    @Override
    public void benefit() {
        if (balance >= 1000) {
            balance = balance * 17 /100 + balance;
        }
    }
}
