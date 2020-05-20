
public class isciyan extends  isci{
    private String izingünü;
    
    public isciyan(String isim, String soyisim, int sn,String izingünü) {
        super(isim, soyisim, sn);
        this.izingünü = izingünü;
        
    }
    public void izinAl(String izinsayi) {
        
        System.out.println(getIsim() + " " + izinsayi + " gün kadar izin veriliyor...");
    }

    @Override
    public void isciBilgisi() {
        super.isciBilgisi(); 
        System.out.println("İşçinin kalan izin gün sayısı:" + izingünü);
        
    }
    
}
