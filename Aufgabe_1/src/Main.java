import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben sie ihr Zahl ein, beachten sie, das die Zahl nicht größer sein darf als 999");
        int zahl = input.nextInt();
        input.close();
        System.out.println("Die Quersumem ihrer Zahl lautet: " + Quersumme.quersumme(zahl));


    }
}