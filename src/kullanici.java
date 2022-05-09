public class kullanici {

    public class KullaniciBuilder {

    }

    private int id;
    private String isim;
    private String sifre;
    private int yas;

    public kullanici(Builder builder){
        this.id = builder.id;
        this.isim = builder.isim;
        this.sifre = builder.sifre;
        this.yas = builder.yas;
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public String getSifre() {
        return sifre;
    }

    public int getYas() {
        return yas;
    }

    @Override
    public String toString() {
        return "Kullanici {" +
                " isim = " + isim +
                " , yas = " + yas +
                '}';
    }

    public static class Builder  {
        private int id;
        private String isim;
        private String sifre;
        private int yas;

        public Builder(String isim, String sifre){
            this.isim = isim;
            this.sifre = sifre;
        }

        public Builder setId(int id){
            this.id = id;
            return this;
        }

        public Builder setYas(int yas) {
            this.yas = yas;
            return this;
        }

        public kullanici build(){
            return new kullanici(this);
        }
    }
}
