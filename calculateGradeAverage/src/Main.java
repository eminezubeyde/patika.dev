import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin not ortalamasını hesaplama
      Scanner scanner=new Scanner(System.in);
        System.out.print("matematik notunuz:");
        int math= scanner.nextInt();
        System.out.print("fizik notunuz:");
        int physics= scanner.nextInt();
        System.out.print("kimya notunuz:");
        int chemistry= scanner.nextInt();
        System.out.print("türkçe notunuz:");
        int turkish= scanner.nextInt();
        System.out.print("tarih notunuz:");
        int history= scanner.nextInt();
        System.out.print("müzik notunuz:");
        int music= scanner.nextInt();

        int total=(math+physics+chemistry+turkish+history+music);
        double average =total/6.0;
      System.out.println("ortalanız:"+ average);
      System.out.print(average > 60 ? "Başarılı oldunuz" : "Başarısız oldunuz");

    }
}