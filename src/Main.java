public class Main {

    public static void main(String[] args) {

        AkilliCihaz akilliCihaz = new AkilliCihaz.AkilliCihazBuilder("Akilli Cihazim")
                .sahibininAdı("BarisPinar")
                .ZamanDilimi("GMT+3")
                .OtoUykuModuSaat(12)
                .build();

        akilliCihaz.baslat();
    }
}
