import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        double yil;

        Scanner girdi = new Scanner(System.in);

        System.out.println("Yil giriniz : ");
        yil = girdi.nextDouble();

        if (yil % 400 == 0 && yil % 100 == 0) {
            System.out.println("Artik yil");
        } else {
            System.out.println("Artik yil degildir.");
            if (yil % 4 == 0 && yil % 100 != 0) {
                System.out.println("Artik yil");
            }else {
                System.out.println("Artik yil degildir.");
            }
        }

    }
}
