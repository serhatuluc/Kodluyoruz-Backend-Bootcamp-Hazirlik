package JAVA101.arrays;
import java.util.Scanner;
import java.util.Arrays;

public class dizidekiElemanlariSiralmaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int dim = input.nextInt();
        int[] list = new int[dim];

        System.out.println("Dizinin elemanlarını giriniz ! ");
        for(int i = 0; i < dim; i++){
            System.out.print( (i+1) + ". Elemanı : ");
            int num = input.nextInt();
            list[i] = num;
        }
        Arrays.sort(list);
        System.out.print("Sıralama : " + Arrays.toString(list));
    }
}
