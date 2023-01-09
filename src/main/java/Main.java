import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String userName, password, sifreSifirlama;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kulanıcı adını giriniz : ");
        userName = inp.nextLine();

        System.out.print("Şifreyi giriniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java")){
            System.out.println("Giriş Yaptınız!");
        }else {
            System.out.println("Bilgilerinizi yanlış girifiniz");
            System.out.print("Şifrenizi Sıfırlamak istiyorsanız evet yazınız : ");
            sifreSifirlama = inp.nextLine();
            if (sifreSifirlama.equals("evet")){
                System.out.print("Yeni Şifrayi Giriniz :");
                password = inp.nextLine();
                if (password.equals("java")){
                    System.out.print("Şifre Oluşturulamadı, lütfen başka şifre giriniz  ");
                }else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }

    }
}
