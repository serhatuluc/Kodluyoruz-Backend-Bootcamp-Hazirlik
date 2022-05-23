import java.util.Scanner;

public class mukemmelSayiBulanProgram {
    public static void main(String[] args) {
        int result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int mukSayi = input.nextInt();

        for (int i = 1; i < mukSayi; i++){
            if (mukSayi % i == 0){
                result += i;
            }
        }
        if (result == mukSayi){
            System.out.print(mukSayi + " mukemmel sayidir.");
        }
        else{
            System.out.print(mukSayi + " mukemmel sayi degildir .");
        }
    }
}
