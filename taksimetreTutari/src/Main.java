import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

          Taksimetre KM başına 2.20 TL tutmaktadır.
          Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
          Taksimetre açılış ücreti 10 TL'dir. */

        Scanner scanner=new Scanner(System.in);
        System.out.print("mesafeyi km cinsinden giriniz :");

       int km=scanner.nextInt();

       double perKm=2.20;
       double total=10;
       total+=(km*perKm);

       total=(total<20) ? 20:total;
        System.out.println("toplam tutar :" +total);
    }
}