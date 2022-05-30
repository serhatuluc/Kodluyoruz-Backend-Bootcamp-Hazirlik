package JAVA101.minesweeper;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satır boyutu : ");
        int row_dim = input.nextInt();
        System.out.print("Sütun boyutu : ");
        int column_dim = input.nextInt();
        mayinTarlasi new_game = new mayinTarlasi(row_dim, column_dim);
        while(true){
            System.out.print("Satır Giriniz : ");
            int row = input.nextInt();
            System.out.print("Sütun Giriniz : ");
            int column = input.nextInt();
            boolean check = new_game.check(row,column);
            if(!check){
                new_game.showMines();
                return;
            }
        }
    }
}
