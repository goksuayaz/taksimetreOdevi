import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double km;

        System.out.print("Km Giriniz : ");
        km = inp.nextDouble();

        double kmFiyat = 2.20;
        int taksimetreAcilis = 10;

        double tutar = taksimetreAcilis + (km * kmFiyat);

        if(tutar <= 20){
            System.out.println("20 TL Ödeyiniz. ");
        }
        else {
            System.out.println(tutar + " TL Ödeyiniz. ");
        }



    }
}