import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VeritabaniBaglanti implements IVeritabani {

    Connection conn;

    @Override
    public boolean baglan() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/SmartDevice", "postgres", "020401");
            if (conn != null) {
                System.out.println("Veritabanina baglanildi.");
                return true;
            }
            else {
                System.out.println("Sistem veritabanina zaten bagli durumda!");
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean kullaniciDogrula(String kullaniciAdi, String sifre) {
        try {
            baglan();

            String sql= "SELECT *  FROM \"users\" WHERE \"username\"='"+ kullaniciAdi + "' AND \"password\"='"+ sifre + "';";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            String kAdi;
            String sf;

            while(rs.next()) {
                kAdi = rs.getString("username");
                sf = rs.getString("password");

                if(kAdi.equals(kullaniciAdi) && sf.equals(sifre)) {
                    return true;
                }
            }

            rs.close();
            stmt.close();

            baglantiSonlandir();

            return false;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void yuksekSicaklikLogla(String sicaklik) {
        try {
            baglan();

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime tarih = LocalDateTime.now();

            String sql= "INSERT INTO LOGLAR (sicaklik, tarih) VALUES (\'" + sicaklik + "\',\'" + dtf.format(tarih) + "\');";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

            conn.close();

            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void baglantiSonlandir() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}