import java.util.Scanner;

public class kdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        double ucret, KDV_ORAN = 0.18, kdvliTutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ucret : ");
        ucret = inp.nextDouble();
        kdvliTutar = ucret*(1+KDV_ORAN);
        System.out.print("KDVli tutar : " + kdvliTutar);

    }
}
