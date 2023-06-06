package Account;

public class ShortTermAccount extends Account {

    public ShortTermAccount(int balance) {
        super(balance);
    }

    @Override
    public void deposit() {

    }

    @Override
    public void withDrow() {

    }

    @Override
    public int getBalance() {
        return super.balance;
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void benefit() {

    }

}
