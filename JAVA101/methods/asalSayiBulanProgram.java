import java.util.Scanner;

public class asalSayiBulanProgram {
    public static void main(String[] args) {
        int counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num = input.nextInt();

        for(int i = 2; i < num -1; i++){
            if(num % i == 0){
                counter++;
            }
        }
        if(counter >= 1){
            System.out.print(num+ " asal sayi degildir.");
        }
        else{
            System.out.print(num+ " asal sayidir.");
        }
    }
}
