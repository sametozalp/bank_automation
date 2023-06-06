package Account;

public class CurrentAccount extends Account {
    
    public CurrentAccount(int balance) {
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