import java.util.Scanner;

public class minMaxDegerliBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac tane sayi giriceksiniz? : ");
        int n = input.nextInt();
        int temp = 0, temp2 = 0, biggest = 0, smallest = 0;

        for(int i = 1; i <= n; i++){
           System.out.println(i + ". Sayiyi giriniz");
           int m = input.nextInt();

           //En kucugunu secen satir
           if(m < temp){
               smallest = m;
               temp = m;
           }

           //En buyugunu secen satir
           if(temp2 < m){
               biggest = m;
               temp2 = m;
           }
        }
        System.out.println("En buyuk sayi : " + biggest);
        System.out.print("En kucuk sayi : " + smallest);

    }
}
