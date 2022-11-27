import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        Scanner scanner=new Scanner(System.in);
        System.out.println("para tuttarını giriniz");
        double amount=scanner.nextInt();
        double kdvliTutar;

        if(amount<=1000){
            kdvliTutar=amount*1.18;

        } else{
            kdvliTutar=amount*1.08;
        }
        System.out.println("KDV'siz fiyat :" +amount);

        System.out.println("KDV'li fiyat:" +kdvliTutar);
    }
}