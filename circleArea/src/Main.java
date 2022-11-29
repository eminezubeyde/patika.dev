import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanı bulan programı yazınız.

         𝜋 sayısını = 3.14 alınız.

         Formül : (𝜋 * (r*r) * a) / 360 */

        Scanner scanner=new Scanner(System.in);
        System.out.print("dairenin yarıçapını giriniz :");
        int r=scanner.nextInt();
        System.out.print("açıyı giriniz : ");
        int a =scanner.nextInt();
        double pi= 3.14;

        int area= (int) ((pi * (r*r) * a)/360);
        System.out.println("dairenin alanı :" +area);


    }
}