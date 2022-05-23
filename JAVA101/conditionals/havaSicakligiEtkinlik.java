import java.util.Scanner;

public class havaSicakligiEtkinlik {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik Giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } if (heat <= 15 && heat <= 25) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } if (heat >= 10 && heat <= 25) {
            System.out.println("Piknige gidebilirsiniz.");
        } else {
            System.out.println("Yuzmeye gidebilirsiniz.");
        }
    }
}
