package Account;

public abstract class Account {

    public int balance;

    public Account(int balance){
        this.balance = balance;
    }

    // para yatırılması
    public abstract void deposit();

    // para çekilmesi
    public abstract void withDrow();

    // anlık bakiye görüntüleme
    public abstract int getBalance();

    // hesap numarası görüntüle
    public abstract int getID();

    // kar miktarı
    public abstract void benefit();

}
