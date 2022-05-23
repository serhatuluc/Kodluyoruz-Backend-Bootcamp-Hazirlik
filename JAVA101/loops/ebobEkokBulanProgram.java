import java.util.Scanner;

public class ebobEkokBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayisini giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 sayisini giriniz : ");
        int n2 = input.nextInt();
        int k = 1;

        while (k <= n1*n2){
            if (k % n1 == 0 && k % n2 ==0){
                System.out.println("ekok : " + k);
                break;
            }
            k++;
        }

        int l = n1*n2;
        while ( l > 1){
            if (n1 % l == 0 && n2 % l == 0){
                System.out.println("ebob : " + l);
                break;
            }
            l --;
        }
    }
}
