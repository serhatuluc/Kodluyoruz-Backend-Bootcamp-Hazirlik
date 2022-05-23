import java.util.Scanner;

public class ciftSayilariBulanProgram {
    public static void main(String[] args) {
        int sayi, toplam = 0, sayim = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++){
            if (i%3 == 0 && i%4 == 0){
                toplam +=  i;
                sayim++;
            }
        }
        double ortalama = toplam / sayim;
        System.out.print("Ortalama : " + ortalama);
    }
}
