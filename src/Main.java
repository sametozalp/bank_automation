public class Main {
    public static String defaultDate;

    public static void main(String[] args) {

        defaultDate = "05.05.2023";
        System.out.println("Tarih: " + defaultDate);

        // create fonk'u kullanmadan hesap oluşturma
        /*
         * shorttermaccount ali = new shorttermaccount(1000, 1);
         * longtermaccount veli = new longtermaccount(3000, 2);
         * currentaccount ahmet = new currentaccount(5000, 3);
         * privateaccount mehmet = new privateaccount(7000, 4);
         *
         * system.out.println(ali.balance);
         */

        Bank bank = new Bank();

        bank.createShortTermAccount(1000, 1); // kısa vadeli hesap oluştur
        bank.createLongTermAccount(3000, 2); // uzun vadeli hesap OLUŞTUR
        bank.createCurrentAccount(5000, 3); // cari hesap oluştur
        bank.createPrivateAccount(7000, 4);// özel hesap oluştur

        bank.getAccount(); // mevcut hesapların listesini getirir

        bank.getDate(); // tarihi getir

        bank.deposit(1, 100); // 1 numaralı id'ye sahip kişiye 100 TL yatır

        bank.withDraw(2, 300); // 2 numaralı id'ye sahip kişiden 300 TL çek

        bank.setDate(18, 10, 2023); // mevcut tarihi düzenler

        bank.showIDs(); // Tüm hesap id'lerini getirir.

        bank.sortition(); // çekiliş
    }
}
