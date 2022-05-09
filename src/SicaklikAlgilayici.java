import java.text.DecimalFormat;
import java.util.Random;

public class SicaklikAlgilayici implements ISicaklikAlgilayici {

    @Override
    public String sicaklikOku() {
        Random r = new Random();
        DecimalFormat formatter = new DecimalFormat("#0.0");

        double sicaklik = 18 + 18 * r.nextDouble();

        return formatter.format(sicaklik) + " °C";
    }
}