import java.util.Scanner;

public class fibonacciSerisiBulanProgram {
    public static void main(String[] args) {
        int first_num = 0, second_num = 1, tmp;

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi uzunlugunu giriniz : ");
        int length = input.nextInt();

        System.out.print(first_num +"   " + second_num + "    ");

        for(int i = 1; i <= length - 1; i++){
            tmp = second_num;
            second_num = second_num + first_num;
            first_num = tmp;
            System.out.print(second_num + "   ");
        }


    }
}
