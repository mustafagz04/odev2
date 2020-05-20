


//Bu classda çalışan iscilerin bilgilerini tutacak değişkenlere isim verdik aynı zamanda sn olarak yazılan değişken iscilerin sistemdeki sistem numarasını temsil etmektedir.
public class isci {
    private String isim;
    private String soyisim;
    private int sn;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String ad) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return isim;
    }

    public void setSoyisim(String soyad) {
        this.isim = isim;
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int id) {
        this.sn = sn;
    }

    public isci(String isim, String soyisim, int sn) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.sn = sn;
    }
    public void isciBilgisi() {
        System.out.println("İsci Bilgileri:::::");
        System.out.println("İsim : " + soyisim);
        System.out.println("Soyisim : " + soyisim);
        System.out.println("Sn : " + sn);
        
    }
    
}
