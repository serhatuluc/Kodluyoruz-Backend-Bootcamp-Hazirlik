//Serhat Uluc //Ending project of JAVA101
package JAVA101.minesweeper;
import java.util.*;

public class mayinTarlasi {
    private char[][] map;
    private char[][] backmap;

    int opened = 0;

    public mayinTarlasi(int row, int column) {
        map = new char[row][column];
        backmap =  new char[row][column];
        tableofStars();
        printtoScreen();
        fillMine(row,column);
    }

    private void tableofStars(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                backmap[i][j] = '-' ;
            }
        }
    }
    public void printtoScreen(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                System.out.print(backmap[i][j] + "\t"); ;
            }
            System.out.println();
        }
    }

    private void fillMine(int row, int column){
        int Max = row * column;

        for(int i = 0; i < Max/4; i++){
            int num_row = (int)(Math.random() * (row));
            int num_column = (int)(Math.random() * ((column)));
            
            if(map[num_row][num_column] != '*'){
                map[num_row][num_column] = '*';
            }
            else{
                i--;
            }
        }
    }

    public static boolean isValidIndex(char[][] arr, int row, int column) {
        return row >= 0 && row < arr.length && column >= 0 && column < arr[0].length ;
    }

    public boolean check(int row,int column){

        if(row < 0 || row >= map.length || column < 0 || column >= map[0].length){
            System.out.println("Dizinin boyutlarını aştınız");
            return false;
        }
        if(opened == map.length * map[0].length - map.length*map[0].length/4 -1){
            System.out.println("Oyunu Kazandınız !");
            return false;
        }
        if(map[row][column] == '*'){
            System.out.println("Mayına bastınız !");
            return false;
        }

        //counting numbers of bomb around the cell
        int count = 0;
        for(int i = row - 1; i < row + 2; i++ ){
            for(int j = column - 1; j < column + 2; j++ ){
                if(isValidIndex(map, i, j)){
                    if(map[i][j] == '*'){
                        count++;
                    }
                }
            }
        }

        //conversion of int to char
        int a = count;
        char b = (char)(a + '0');

        //counting opened cell
       if(backmap[row][column] !=b){
            backmap[row][column] = b;
            opened++;
       }
        printtoScreen();
       System.out.println("===================================================");
        return true;
    }

    public void showMines(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
