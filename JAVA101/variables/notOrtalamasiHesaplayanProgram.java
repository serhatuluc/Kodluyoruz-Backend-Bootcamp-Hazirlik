import java.util.Scanner;

public class notOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        int mat,turkce,fizik,kimya,tarih,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notu:");
        mat = inp.nextInt();

        System.out.print("Türkçe notu:");
        turkce = inp.nextInt();

        System.out.print("Fizik notu:");
        fizik = inp.nextInt();

        System.out.print("Kimya notu:");
        kimya = inp.nextInt();

        System.out.print("Tarih notu:");
        tarih = inp.nextInt();

        System.out.print("Müzik notu:");
        muzik = inp.nextInt();

        float ortalama= (mat+turkce+fizik+kimya+tarih+muzik)/6;
        String sonuc = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print("Not ortalamanız: " + ortalama + "\n");
        System.out.printf(sonuc);


    }

}
