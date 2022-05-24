package JAVA101.arrays;
import java.util.Arrays;
import java.util.Scanner;


public class maxMinBulanProgram {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        System.out.println("Dizi : " + Arrays.toString(list));
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayi : ");
        int num = input.nextInt();

        Arrays.sort(list);

        for(int i: list){
            if(i > num){
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + i);
                System.out.println("Girilen sayıdan küçük en yakın sayı : " + list[Arrays.binarySearch(list,i) - 1]);
                break;
            }
        }
    }
}
