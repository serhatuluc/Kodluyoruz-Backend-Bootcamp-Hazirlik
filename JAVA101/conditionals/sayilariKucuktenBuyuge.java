import java.util.Scanner;

public class sayilariKucuktenBuyuge {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("1.sayi :");
        a = input.nextInt();

        System.out.println("2.sayi :");
        b = input.nextInt();

        System.out.println("3.sayi :");
        c = input.nextInt();

        if ((a > b) && (a > c)){
            if(b > c){
                System.out.print("c < b < a");
            }
            else{
                System.out.print("b < c < a");
            }
        }
        else if((b > a) && (b > c)){
            if(a > c){
                System.out.print("c < a < b");
            }
            else{
                System.out.print("a < c < b");
            }
        }
        else {
            if (b > a) {
                System.out.print("a < b < c");
            } else {
                System.out.print("b < a < c");
            }
        }

    }
}
