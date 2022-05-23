import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        String username, password;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici Adiniz : ");
        username = inp.nextLine();
        System.out.print("Sifreniz : ");
        password = inp.nextLine();

        //Sifre ve kullanici adini kontrol eder
        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Giris yaptiniz !");
        }

        //Kullanici adi dogru ve sifre yanlis olma durumu
        else if(username.equals("patika") && !password.equals("java123")){
            System.out.println("Sifre yanlis !");

            //Kullaniciya yeni sifre ister mi sorusu
            System.out.print("Yeni sifre olusturmak istermisiniz ? (y or n) : ");
            String check = inp.nextLine();


            if(check.equals("y")){
                System.out.print("Yeni sifre :");
                String newPassword = inp.nextLine();

                String sonuc = newPassword.equals("java123") ? "Eski sifre olamaz" : "Sifre olusturuldu";
                System.out.print(sonuc);
            }
            else{
                System.out.println("Gule gule !");
            }
        }
        else{
            System.out.print("Bilgileriniz yanlis !");
        }

    }
}
