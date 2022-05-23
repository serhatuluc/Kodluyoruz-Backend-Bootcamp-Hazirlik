import java.util.Scanner;

public class burcBulanProgram {
    public static void main(String[] args) {

        int gun, ay;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dogdugunuz gnu girin : ");
        gun = sc.nextInt();

        System.out.println("Dogdugunuz ayi girin: ");
        ay = sc.nextInt();

        if ((gun>21 && ay == 12) || (gun<=19 && ay== 1)){
            System.out.println("Burcunuz Oglak");
        }
        if ((gun>20 && ay ==1) || (gun<=18 && ay == 2)){
            System.out.println("Burcunuz Kova");
        }
        if ((gun>19 && ay == 2) || (gun <=20 && ay == 3)){
            System.out.println("Burcunuz Balik");
        }
        if ((gun>21 && ay == 3) || (gun <=20 && ay == 4)){
            System.out.println("Burcunuz Koc");
        }
        if ((gun>21 && ay == 4) || (gun <=20 && ay == 5)){
            System.out.println("Burcunuz Boga");
        }
        if ((gun>21 && ay == 5) || (gun<=20 && ay == 6)){
            System.out.println("Burcunuz Ikizler");
        }
        if ((gun>21 && ay == 6) || (gun<=20 && ay == 7)){
            System.out.println("Burcunuz Yengec");
        }
        if ((gun>21 && ay  == 7) || (gun<=20 && ay== 8)){
            System.out.println("Burcunuz  Aslan");
        }
        if ((gun>21 && ay ==8) || (gun<=22 && ay == 9)){
            System.out.println("Burcunuz Basak");
        }
        if ((gun>23 && ay == 9) || (gun<=20 && ay ==10)){
            System.out.println("Burcunuz Terazi");
        }
        if ((gun>21 && ay == 10) || (gun<=22 && ay == 11)){
            System.out.println("Burcunuz Akrep");
        }
        if ((gun>23 && ay == 11) || (gun<=20 && ay == 12)){
            System.out.println("Burcunuz Yay");
        }
    }
}

