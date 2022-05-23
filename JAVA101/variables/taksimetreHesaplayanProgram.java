import java.util.Scanner;

public class taksimetreHesaplayanProgram {
    public static void main(String[] args) {
        double tutarKm = 2.20, tutar, MIN = 20, ACILIS = 10, km;

        //Kac km yol aldigi soruluyor
        Scanner inp = new Scanner(System.in);
        System.out.print("Km : ");
        km = inp.nextDouble();

        //Tutar belirleniyor
        tutar = tutarKm * km + ACILIS;
        double sonTutar = tutar > MIN ? tutar : 20;
        System.out.print("Tutar : " + sonTutar);
    }
}
