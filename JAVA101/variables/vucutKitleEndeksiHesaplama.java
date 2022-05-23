import java.util.Scanner;

public class vucutKitleEndeksiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = inp.nextDouble();
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = inp.nextDouble();

        double index = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz  : " + index);
    }
}
