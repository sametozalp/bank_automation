import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Bank extends Main {
    public static ArrayList<Map<Integer, Integer>> listID = new ArrayList<>();
    public int balance;

    // mevcut hesapların listesi
    public void getAccount() {
        System.out.println("Kayıtlı tüm hesaplar ve hesap bakiyeleri: " + listID);
    }

    // şu anki tarih
    public void getDate() {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(
                "Anlık tarih ve saat: " + now.getDayOfMonth() + "." + now.getMonthValue() + "." + now.getYear());

    }

    // para yatır
    public void deposit(int ID, int addBalance) {
        for (Map<Integer, Integer> map : listID) {

            if (map.containsKey(ID)) {
                int value = map.get(ID);
                value = value + addBalance;
                map.put(ID, value);
                System.out.println("Para yatırıldı. Mevcut bakiye: " + value + " (ID: " + ID + ")");
                break;
            }
        }
    }

    // para çek
    public void withDraw(int ID, int subBalance) {
        for (Map<Integer, Integer> map : listID) {

            if (map.containsKey(ID)) {
                int value = map.get(ID);
                if (value < subBalance) {
                    System.out.println("İşlem başarısız. Hesabınızda bu kadar para mevcut değil");
                    break;
                } else {
                    value = value - subBalance;
                    map.put(ID, value);
                    System.out.println("Para çekildi. Mevcut bakiye: " + value + " (ID: " + ID + ")");
                    break;
                }

            }
        }
    }

    // çekiliş
    public void sortition() {

        Random random = new Random();
        int randomNumber = random.nextInt(listID.size());
        String a = listID.get(randomNumber).values().toString().substring(1,
                listID.get(randomNumber).values().toString().indexOf("]"));
        int b = Integer.parseInt(a) + 10000;
        System.out.println(
                "\nÇekiliş yapıldı, kazanan: " + listID.get(randomNumber) + " - Mevcut yeni bakiye: "
                        + b);

    }

    public void createCurrentAccount(int balance, int ID) {
        CurrentAccount currentAccount = new CurrentAccount(balance, ID);
        System.out.println("Hesap oluşturuldu. Mevcut bakiye: " + balance + " (ID = " + ID + ")");
    }

    public void createPrivateAccount(int balance, int ID) {
        PrivateAccount privateAccount = new PrivateAccount(balance, ID);
        System.out.println("Hesap oluşturuldu. Mevcut bakiye: " + balance + " (ID = " + ID + ")");
    }

    public void createLongTermAccount(int balance, int ID) {
        LongTermAccount longTermAccount = new LongTermAccount(balance, ID);
        System.out.println("Hesap oluşturuldu. Mevcut bakiye: " + balance + " (ID = " + ID + ")");
    }

    public void createShortTermAccount(int balance, int ID) {
        ShortTermAccount shortTermAccount = new ShortTermAccount(balance, ID);
        System.out.println("Hesap oluşturuldu. Mevcut bakiye: " + balance + " (ID = " + ID + ")");
    }

    // para yatırılması
    public void increaseCash(int addBalance) {
        balance = addBalance + balance;
    }

    // para yatırılması
    public void descreaseCash(int addBalance) {
        balance = balance - addBalance;
    }

    public void setDate(int dd, int mm, int yy) {
        defaultDate = dd + "." + mm + "." + yy;
        System.out.println("Tarih güncellendi: " + defaultDate);
    }

    public void showIDs() {
        System.out.print("Mevcut ID'ler: ");
        for (Map<Integer, Integer> map : listID) {

            System.out.print(map.keySet());
        }
    }
}
