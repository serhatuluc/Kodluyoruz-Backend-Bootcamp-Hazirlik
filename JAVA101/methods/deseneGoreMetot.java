package JAVA101.methods;
import java.util.Scanner;



public class deseneGoreMetot {
    static int decrease(int a){

        if(a <= 0){
            return a;
        }

        System.out.print(a + "\t");
        return decrease(a-5);
    }

    static int increase(int a, int lowestPoint){
        System.out.print(a + "\t");

        if(a == lowestPoint){
            return a;
        }

        return increase(a+5,lowestPoint);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int num = input.nextInt();

        //lowest point is obtained from method called decrease then increase method is used
        int lowestPoint= decrease(num);
        increase(lowestPoint,num);
    }
}
