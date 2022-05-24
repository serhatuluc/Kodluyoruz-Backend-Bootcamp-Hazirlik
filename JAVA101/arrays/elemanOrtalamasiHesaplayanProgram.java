package JAVA101.arrays;
import java.util.Arrays;

public class elemanOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        float sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += 1f/ numbers[i];
        }
        System.out.printf("toplam %.2f" , sum);
    }
}
