import java.util.Scanner;

public class ucgenAlanHesaplayanProgram {
    public static void main(String[] args) {
        double a,b,c;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kenar 1 : ");
        a = inp.nextDouble();
        System.out.print("Kenar 2 : ");
        b = inp.nextDouble();
        System.out.print("Kenar 3 : ");
        c = inp.nextDouble();

        double u = (a+b+c) / 2;
        double alan = u*(u-a)*(u-b)*(u-c);
        System.out.print("Alan : " + Math.sqrt(alan));
    }
}
