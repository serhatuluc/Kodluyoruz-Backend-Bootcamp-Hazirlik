import java.util.Scanner;

public class tersUcgenYapanProgram {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = n -1 ; i >= 0 ; i--) {
            for (int j = (n - i-1); j >=0 ; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i ); k >= 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
