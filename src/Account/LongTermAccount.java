package Account;

public class LongTermAccount extends Account {

    public LongTermAccount(int balance) {
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