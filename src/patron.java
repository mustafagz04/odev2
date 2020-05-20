
public class patron extends isci {
    private int iscisayisi;

    public patron(String isim, String soyisim, int sn,int iscisayisi) {
        super(isim, soyisim, sn);
        this.iscisayisi = iscisayisi;
        
    }

    @Override
    public void isciBilgisi() {
        super.isciBilgisi(); 
        System.out.println("Patronun Sorumlu Olduğu Kişi Sayısı : " + iscisayisi);

    }
    public void zamYap(int zamMiktari) {
        
        System.out.println(getIsim() + " çalışanlara " + zamMiktari + " kadar zam yapıyor...");
    } 
    
}