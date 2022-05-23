import java.util.Scanner;

public class cinZodyagiHesaplama {
    public static void main(String[] args) {
        int dogumYili;

        Scanner input = new Scanner(System.in);
        System.out.print("Dogum yili giriniz : ");
        dogumYili = input.nextInt();

        if(dogumYili % 12 == 0){
            System.out.print("Cin zodyagi burcunuz : Maymun" );
        }
        else if(dogumYili % 12 == 1){
            System.out.print("Cin zodyagi burcunuz : Horoz" );
        }

        else if(dogumYili % 12 == 2){
            System.out.print("Cin zodyagi burcunuz : Kopek" );
        }
        else if(dogumYili % 12 == 3){
            System.out.print("Cin zodyagi burcunuz : Domuz" );
        }
        else if(dogumYili % 12 == 4){
            System.out.print("Cin zodyagi burcunuz : Fare" );
        }
        else if(dogumYili % 12 == 5){
            System.out.print("Cin zodyagi burcunuz : Okuz" );
        }
        else if(dogumYili % 12 == 6){
            System.out.print("Cin zodyagi burcunuz : Kaplan" );
        }
        else if(dogumYili % 12 == 7){
            System.out.print("Cin zodyagi burcunuz : Tavsan" );
        }
        else if(dogumYili % 12 == 8){
            System.out.print("Cin zodyagi burcunuz : Ejderha" );
        }
        else if(dogumYili % 12 == 9){
            System.out.print("Cin zodyagi burcunuz : Yilan" );
        }
        else if(dogumYili % 12 == 10){
            System.out.print("Cin zodyagi burcunuz : At" );
        }
        else{
            System.out.print("Cin zodyagi burcunuz : Koyun" );
        }
    }
}
