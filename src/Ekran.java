public class Ekran implements IEkran {

    @Override
    public void mesajGoruntule(String mesaj) {
        System.out.println(mesaj);
    }

    public void hataMesajiGoruntule(String mesaj) {
        System.out.println("[HATA] " + mesaj);
    }

    public void menuYazdir() {
        System.out.println("\n********** ANA MENU **********");
        System.out.println("1- Sicaklik Goruntule");
        System.out.println("2- Sogutucuyu Ac");
        System.out.println("3- Sogutucuyu Kapat");
        System.out.println("4- Sistemden Cikis Yap");
        System.out.println("******************************");
    }
}
