import java.util.Scanner;

public class artikYilHesaplayanProgram {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);
        System.out.print("Yili giriniz : ");
        yil = input.nextInt();

        if (yil % 100 != 0){
            if(yil % 4 == 0){
                System.out.print(yil + " artik bir yildir.");
            }
            else{
                System.out.print(yil + " artik bir yil degildir.");
            }
        }
        else {
            if (yil % 400 == 0) {
                System.out.print(yil + " artik bir yildir.");
            } else {
                System.out.print(yil + " artik bir yil degildir.");
            }
        }
    }
}
