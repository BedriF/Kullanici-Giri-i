import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName,password,newPassword;
        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adını Giriniz :  ");
        userName = input.nextLine();

        System.out.println("Şifreniz :  ");
        password = input.nextLine();

        if(password.equals("java123")) {
            System.out.print("Başarılı giriş yaptınız:  ");
        }
        else
        {
            System.out.print("Bilgileriniz Yanlış:  ");
            System.out.print("Şifrenizi sıfırmak için 1 e çıkmak için 2 ye basınız:  ");
            num = input.nextInt();

            switch(num) {
            case 1:
                System.out.print("Şifre sıfırlama:  ");
                System.out.println("Yeni Şifre Giriniz\n (Not: Esik şifreniz ve hatalı girdiğiniz şifre ile aynı olmasın) :  ");
                Scanner input2 = new Scanner(System.in);
                newPassword = input2.nextLine();

                if(password.equals(newPassword)){
                    System.out.print("Hata! yeni şifre hatalı girilen şifre ile aynı olamaz: \n Lütfen yeni şifre giriniz  ");
                    Scanner input3 = new Scanner(System.in);
                    newPassword = input3.nextLine();
                    System.out.print("*********** Şifre oluşturuldu **********  ");
                }
                else if (newPassword.equals("java123")){
                    System.out.print("Hata! yeni şifre eski şifre ile aynı olamaz: \n Lütfen yeni şifre giriniz  ");
                    Scanner input4 = new Scanner(System.in);
                    newPassword = input4.nextLine();
                    System.out.print("*********** Şifre oluşturuldu **********  ");
                }
                break;
                case 2:
                    System.out.println("Program kapatılıyor...");
        }

        }

        }

    }
