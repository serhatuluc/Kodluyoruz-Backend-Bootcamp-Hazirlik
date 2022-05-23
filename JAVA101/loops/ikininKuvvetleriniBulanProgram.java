import java.util.Scanner;

public class ikininKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sinir sayisini giriniz : ");
        n = scan.nextInt();

        for (int i = 1,j=1; i <= n && j <= n ; i*=4, j*=5){
            if(i != 1 && j != 1) {
                System.out.println(i);
                System.out.println(j);
            }
        }
    }
}
