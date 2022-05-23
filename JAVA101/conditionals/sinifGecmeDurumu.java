import java.util.Scanner;

public class sinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,turkce,fizik,kimya,muzik;

        System.out.println("Notlari giriniz: 0 - 100");

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Matematik notu:");
            mat = inp.nextInt();
        } while(mat < 0 || mat > 100);

        do {
            System.out.print("Türkçe notu:");
            turkce = inp.nextInt();
        } while(turkce < 0 || turkce > 100);


        do {
            System.out.print("Fizik notu:");
            fizik = inp.nextInt();
        } while(fizik < 0 || fizik > 100);


        do {
            System.out.print("Kimya notu:");
            kimya = inp.nextInt();
        } while(kimya < 0 || kimya > 100);


        do {
            System.out.print("Fizik notu:");
            muzik = inp.nextInt();
        } while(muzik < 0 || muzik > 100);

        double ortalama= (mat+turkce+fizik+kimya+muzik)/5;
        if(ortalama <= 55){
            System.out.println("Sinifta kaldiniz,seneye tekrar gorusmek uzere!");
        }
        else{
            System.out.println("Tebrikler,sinifi gectiniz !");
        }
        System.out.print("Ortalamaniz : " + ortalama);
    }
}
