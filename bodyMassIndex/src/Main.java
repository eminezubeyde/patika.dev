import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("boyunuzu giriniz :");
        double height =scanner.nextDouble();
        System.out.print("kilonuzu giriniz :");
        int weight=scanner.nextInt();

        double bodyMassIndex = weight / height * height;

        System.out.println("vücut kitle indeksiniz :" + bodyMassIndex);






        

    }
}