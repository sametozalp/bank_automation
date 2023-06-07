import java.util.HashMap;
import java.util.Map;

public abstract class Account extends Bank {

    public int balance;
    public int createID;
    Map<Integer, Integer> map = new HashMap<>();

    public Account(int balance, int createID) {
        this.balance = balance;
        this.createID = createID;
        map.put(createID, balance);
        listID.add(map);
    }

    // para yatırılması
    public void deposit(int addBalance) {
        balance = addBalance + balance;
    }

    // para çekilmesi
    public void withDrow(int subBalance) {
        if (subBalance > balance) {
            System.out.println("Bakiye yetersiz!");
        } else {
            balance = balance - subBalance;
        }
    }

    // anlık bakiye görüntüleme
    public int getBalance() {
        return balance;
    }

    // hesap numarası görüntüle
    public int getID() {
        return createID;
    }

    // kar miktarı
    public abstract void benefit();
}
