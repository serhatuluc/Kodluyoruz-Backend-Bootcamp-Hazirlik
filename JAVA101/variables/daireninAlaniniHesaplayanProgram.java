import java.util.Scanner;

public class daireninAlaniniHesaplayanProgram {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Yaricap : ");
        int r = inp.nextInt();
        System.out.print("Aci : ");
        int a = inp.nextInt();

        double alan = a * Math.PI * r *r / 360;
        System.out.printf("Dilimin Alani :%.2f ", alan);
    }
}
