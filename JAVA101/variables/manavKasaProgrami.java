import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        double armutF = 2.14, elmaF=3.67, domatesF=1.11, muzF=0.95, patlicanF=5.00;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        int armutKG = inp.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        int elmaKG = inp.nextInt();

        System.out.print("Domates Kaç Kilo ? : ");
        int domatesKG = inp.nextInt();

        System.out.print("Muz Kaç Kilo ? : ");
        int muzKG = inp.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        int patlicanKG = inp.nextInt();

        double tutar = armutF*armutKG + elmaF*elmaKG + domatesF*domatesKG + muzF*muzKG +patlicanF*patlicanKG;
        System.out.print("Toplam Tutar : " + tutar);

    }
}
