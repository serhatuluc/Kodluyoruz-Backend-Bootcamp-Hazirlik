import java.util.Scanner;

public class hipotenusBulanProgram {
    public static void main(String[] args) {
        double a,b,c;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kenar 1 : ");
        a = inp.nextDouble();
        System.out.print("Kenar 2 : ");
        b = inp.nextDouble();

        c = a*a + b*b;
        double hipotenus = Math.sqrt(c);
        System.out.print("Hipotenus : " + hipotenus);
    }
}
