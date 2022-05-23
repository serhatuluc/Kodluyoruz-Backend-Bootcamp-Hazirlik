import java.util.Scanner;

public class ucakBiletiHesaplayanProgram {
    public static void main(String[] args) {
        int yas, KM, yolTip;

        Scanner input = new Scanner(System.in);

        //Hem hatali veri uyarisi yapip hem de tekrardan veri girmesini saglayan program
        do {
            System.out.print("Yas giriniz : ");
            yas = input.nextInt();

            //Pozitif sayi degilse uayri veren satir
            if (yas < 0){
                System.out.println("Hatalı Veri Girdiniz !");
            }
        //Tekrar veri girisi isteyen satir
        } while(yas < 0 );


        do {
            System.out.print("Mesafe giriniz : ");
            KM = input.nextInt();
            if (KM < 0){
                System.out.println("Hatalı Veri Girdiniz !");
            }
        } while(KM < 0 );


        do {
            System.out.print("Yolculuk tipini giriniz : ");
            yolTip = input.nextInt();
            if (yolTip < 0){
                System.out.println("Hatalı Veri Girdiniz !");
            }
        } while(yolTip <= 0 || yolTip >= 3);

        double toplamFiyat = KM * 0.1;

        if (yas < 12){
           toplamFiyat = toplamFiyat - toplamFiyat*0.5;
        }
        if (yas > 12 && yas < 24){
            toplamFiyat = toplamFiyat - toplamFiyat*0.1;
        }
        if (yas > 65){
            toplamFiyat = toplamFiyat - toplamFiyat*0.3;
        }
        if (yolTip == 2){
            toplamFiyat = (toplamFiyat - toplamFiyat*0.2)*2;
        }
        System.out.print("Toplam Tutar : " + toplamFiyat + " TL");
    }
}
