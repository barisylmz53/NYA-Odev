public class Eyleyici implements IEyleyici, IObserver {
    public class IEyleyici {

    }

    private boolean sogutucuDurumu = false;

    @Override
    public void sogutucuAc() {
        if (!sogutucuDurumu) {
            System.out.println("Sogutucu aciliyor...");

            sogutucuDurumu = true;

            System.out.printf("Sogutucu acildi!");
        } else {
            System.out.printf("Sogutucu zaten aktif durumda!");
        }
    }

    @Override
    public void sogutucuKapat() {
        if (sogutucuDurumu) {
            System.out.println("Sogutucu kapatiliyor...");

            sogutucuDurumu = false;

            System.out.printf("Sogutucu kapatildi!");
        } else {
            System.out.println("Sogutucu zaten kapali durumda!");
        }
    }

    @Override
    public void update(String mesaj, String derece) {
        if (!sogutucuDurumu) {
            System.out.println(mesaj + " , (" + derece + ") sogutucu otomatik olarak acik duruma getiriliyor");
            sogutucuAc();
        }

    }
}
