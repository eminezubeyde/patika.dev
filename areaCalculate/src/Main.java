import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        /* alan formülü= Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
                         𝑢 = (a+b+c) / 2
                         Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */

        Scanner scanner= new Scanner(System.in);
        System.out.print("a kenarını giriniz :");
        double a= scanner.nextInt();
        System.out.print("b kenarını giriniz :");
        double b= scanner.nextInt();
        System.out.print("a kenarını giriniz :");
        double c= scanner.nextInt();

        double u=(a+b+c)/2;
        double area= Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("alan :"+area);



    }
}