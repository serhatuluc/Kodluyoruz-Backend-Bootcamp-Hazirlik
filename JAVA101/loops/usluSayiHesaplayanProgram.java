import java.util.Scanner;

public class usluSayiHesaplayanProgram {
    public static void main(String[] args) {
        int n, k, total = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ussu alinacak sayiyi giriniz : ");
        n = scan.nextInt();
        System.out.print("Us olacak sayiyi giriniz : ");
        k = scan.nextInt();

        for (int i = 1; i <= k; i++){
            total = total * n;
        }

        System.out.print("Sonuc : " + total);
    }
}
