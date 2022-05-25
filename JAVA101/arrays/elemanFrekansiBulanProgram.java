package JAVA101.arrays;
import java.util.Arrays;

public class elemanFrekansiBulanProgram {
    static boolean isCheck(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] unrepeated = new int[list.length];
        int index = 0;
        int count = 0;

        for (int i = 0;i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if(i != j && list[i] == list[j]){
                    count++;
                }
            }

            if (!isCheck(unrepeated, list[i])){
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
                unrepeated[index++] = list[i];
            }
            count = 0;
        }
    }
}
