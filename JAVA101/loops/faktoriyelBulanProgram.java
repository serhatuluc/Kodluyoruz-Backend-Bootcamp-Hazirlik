import java.util.Scanner;

public class faktoriyelBulanProgram {
    public static void main(String[] args) {
        int n, r;
        int nFaktoriyel = 1,rFaktoriyel = 1, n_rFaktoriyel = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("n sayisi giriniz : ");
        n = scan.nextInt();
        System.out.print("r sayisi giriniz : ");
        r = scan.nextInt();

        for(int i = 1; i <= n; i++){

            //n sayisinin faktoriyelini bulur
            nFaktoriyel = nFaktoriyel * i;

            //n-r sayisinin faktoriyelini ceker
            if (i == n-r){
                n_rFaktoriyel = nFaktoriyel;
            }

            //r sayisinin faktoriyelini ceker
            if (i == r){
                rFaktoriyel = nFaktoriyel;
            }

        }
        int kombinasyon = nFaktoriyel/(n_rFaktoriyel * rFaktoriyel);
        System.out.print("Kombinasyon sonucu : " + kombinasyon);
    }
}