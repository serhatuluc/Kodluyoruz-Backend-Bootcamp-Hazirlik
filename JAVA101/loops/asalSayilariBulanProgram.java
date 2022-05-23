public class asalSayilariBulanProgram {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 100; i++){
            for(int j = 2; j <= i-1; j++){
                if(i % j == 0){
                    break;
                }
                else{
                    counter ++;
                }
            }
            //Kendisine ve 1' e bolumu ihmal edilince i - 2 tane sayiya kadar count edilmis olmasi gerekir
            if (counter == i - 2){
                System.out.print(i + "    ");
            }
            counter = 0;
        }
    }
}
