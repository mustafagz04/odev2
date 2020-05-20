
import java.util.Scanner;


public class girisMenü {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("SİSTEME HOŞ GELDİNİZ....");
        
        String islemler = "İşlemler...\n"
                          + "1.İşçi İşlemleri\n"
                          + "2. Patron İşlemleri\n"
                          + "Çıkış İçin x'ya basın";
        System.out.println("**********************************");
        System.out.println(islemler);
        System.out.println("**********************************");
        
        while (true) {
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("x")){
                
                System.out.println("Sistemden Çıkılıyor...");
                break;
                
            }
            else if (islem.equals("1")){
                isciyan isciii = new isciyan("Kerem","devrilmez", 567,"27");
                String isciii_islem = "1. İzin Al\n"
                                         +"2. Bilgileri Göster\n"
                                         + "Çıkış için x'ya basın";
                System.out.println(isciii_islem);
                
                while (true) {
                    System.out.print("İşlemi Seçiniz : ");
                    String i_islem = scanner.nextLine();
                    
                    if (i_islem.equals("q")) {
                        System.out.println("İşçi İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if (i_islem.equals("1")){
                        
                        System.out.print("Alcağınız izin gün  Sayısı : ");
                        String izinsayi = scanner.nextLine();
                        isciii.izinAl(izinsayi);
                        
                    }
                    else if (i_islem.equals("2")){
                        
                        isciii.isciBilgisi();
                    }
                    else {
                        System.out.println("Geçersiz İşçi İşlemi...");
                    }
                    
                }
                
            }
            else if (islem.equals("2")) {
                patron yonetici = new patron("Aytaç","ergün", 123, 10);
                
                String patron_islem = "Patron İşlemleri\n"
                                        + "1. Zam Yap\n"
                                        + "2. Bilgileri Göster\n"
                                        + "Çıkış için x'ya basın";
                System.out.println(patron_islem);
                
                while (true) {
                    System.out.println("İşlemi Seçiniz: ");
                    String i_islem = scanner.nextLine();
                    
                    if (i_islem.equals("x")){
                        System.out.println("Patron İşlemlerinden Çıkılıyor...");
                        break;
                        
                    }
                    else if (i_islem.equals("1")) {
                        System.out.print("Patronun ne kadar zam yapmasını istiyorsunuz : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                        
                    }
                    else if (i_islem.equals("2")){
                        yonetici.isciBilgisi();
                        
                    }
                    else {
                        System.out.println("Geçersiz Patron İşlemi....");
                    }
                    
                    
                }
                
            }
            else {
                System.out.println("Geçersiz İşlem....");
            }
            
            
        }
        
        
    }
}
