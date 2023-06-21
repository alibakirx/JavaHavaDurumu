import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.println("Geçerli Bir Sıcaklık Değeri Giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5){
            System.out.println("Hava Sıcaklığı Kayak Yapmaya Uygun");
        }
        else if(sicaklik <= 25){
            if(sicaklik <= 15){
                System.out.println("Hava sıcaklığı Yürüyüş Yapmaya Uygun");
            }
            else if (sicaklik >= 15) {
                System.out.println("Hava sıcaklığı piknik yapmaya uygun");

            }
        }
        else {
            System.out.println("Hava Sıcaklığı Yüzmeye Uygun");
        }



    }
}