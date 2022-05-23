import java.util.Scanner;

public class usHesabiYapanProgram {
    public static void main(String[] args) {
        int result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Base : ");
        int base = input.nextInt();
        System.out.print("Exp : ");
        int exp = input.nextInt();

        for(int i = 1; i <= exp; i++){
            result *= base;
        }
        System.out.print("Result : " + result);
    }
}
