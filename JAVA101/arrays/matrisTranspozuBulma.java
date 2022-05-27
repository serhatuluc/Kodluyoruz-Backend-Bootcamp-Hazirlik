package JAVA101.arrays;
import java.util.Scanner;
import java.util.Arrays;

public class matrisTranspozuBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n : ");
        int n = input.nextInt();
        System.out.print("k : ");
        int k = input.nextInt();

        int[][] matrix = new int[n][k];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                System.out.print("i : " +i + " j : " + j +" = ");
                int element = input.nextInt();
                matrix[i][j] = element;
            }
        }

        int [][] transpose = new int[k][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < k; ++j) {
             transpose[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < k; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(transpose[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
