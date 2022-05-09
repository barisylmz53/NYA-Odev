public class AgArayuzu implements IAgArayuzu, IObserver {
    @Override
    public void sogucutuAc(IEyleyici eyleyici) {
        eyleyici.sogutucuAc();
    }

    @Override
    public void sogutucuKapat(IEyleyici eyleyici) {
        eyleyici.sogutucuKapat();
    }

    @Override
    public String sicaklikGonder(ISicaklikAlgilayici sicaklikAlgilayici) {
        return sicaklikAlgilayici.sicaklikOku();
    }

    @Override
    public void update(String mesaj, String derece) {
        VeritabaniIslem veritabaniIslem = new VeritabaniIslem(new VeritabaniBaglanti());
        veritabaniIslem.yuksekSicaklikLogla(derece);
    }
}
