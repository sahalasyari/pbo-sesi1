
public class Laptop {
    String jenis_Laptop;
    int tahun_pembuatan;

    public void setDataLaptop(String jenis, int tahun){
        jenis_hp = jenis;
        tahun_pembuatan = tahun;
    }

    public String getLaptop(){
        return jenis_hp;
    }

    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
        HandPhone hp = new Laptop();
        hp.setDataHandPhone("Iphone 15 Pro Max", 2023);
        System.out.println(hp.getLaptop());
        System.out.println(hp.getTahunPembuatan());
    }
}