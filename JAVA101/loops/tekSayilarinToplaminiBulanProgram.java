import java.util.Scanner;

public class tekSayilarinToplaminiBulanProgram {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.print("Sayi giriniz : ");
            n = scan.nextInt();
            if (n % 4 == 0){
                total += n;
            }
        }while(n % 2 == 0);

        System.out.println("Toplam : " + total);
    }
}
