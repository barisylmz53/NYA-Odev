import java.sql.ResultSet;

public interface IVeritabani {
    public boolean baglan();
    public boolean kullaniciDogrula(String kullaniciAdi, String sifre);
    public void yuksekSicaklikLogla(String sicaklik);
    public void baglantiSonlandir();
}