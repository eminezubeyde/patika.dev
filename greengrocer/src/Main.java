import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz= 0.95;
        double Patlican = 5;
        double  toplam ;
        double kgarmut, kgelma, kgdomates, kgmuz, kgpatlican;



        Scanner greengrocer = new Scanner(System.in);



        System.out.println("armut kg giriniz:");
        kgarmut= greengrocer.nextDouble();

        System.out.println("elma kg giriniz:");
        kgelma = greengrocer.nextDouble();

        System.out.println("domates kg giriniz:");
        kgdomates = greengrocer.nextDouble();

        System.out.println("muz kg giriniz:");
        kgmuz= greengrocer.nextDouble();

        System.out.println("patlıcan kg giriniz:");
        kgpatlican= greengrocer.nextDouble();


        toplam= ( kgarmut*Armut)+(kgelma*Elma)+(kgdomates*Domates)+(kgpatlican*Patlican)+(kgmuz*Muz);



        System.out.println("toplam tutar:"+ toplam);
    }
}