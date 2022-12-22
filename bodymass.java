import java.util.Scanner;
public class bodymass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Olarak Girin :");
        double kg= input.nextDouble();
        System.out.print("Lütfen Boyunuzu Metre Olarak Girin :");
        double cm= input.nextDouble();

        double result = kg/(cm*cm);
        System.out.println("Vücut Kitle Indeksiniz :" + result);
    }

}


