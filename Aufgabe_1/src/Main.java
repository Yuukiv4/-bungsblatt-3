import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Erstellung des Scanners
        Scanner input = new Scanner(System.in);
        //Eingabe der gewünschten Zahl
        System.out.println("Bitte geben sie ihr Zahl ein, beachten sie, das die Zahl nicht größer sein darf als 999");
        int zahl = input.nextInt();
        System.out.println("Bitte geben sie die Basis ihres gewünschten Stellenwertsystems ein");
        int basis = input.nextInt();
        System.out.println("Bitte geben sie ihre Zahl,welche in ihrem Stellewertsystem liegt, ein, sie darf nur dreistellig sein");
        String hexZahl = input.next();
        input.close();
        System.out.println(hexZahl);


        //Aufruf der class "Quersumme" und der Funktion Quersumme in dieser class mit der übergabe des Integers zahl
        int ergebnissZahl = Quersumme.quersumme(zahl);
        //Aufruf der class "Quersumme" und der Funktion Quersumme in dieser class mit der Übergabe des Strings hexZahl
        String ergebnissHex = Quersumme.quersummeHex(hexZahl,basis);
        //Ausgabe der Quersumme der Zahl
        System.out.println("Die Quersumme ihrer Zahl lautet: " + ergebnissZahl);
        //Ausgabe der Zahl, welche in einem beliebigen Stellenwertsysstem eingegeben wurde und als Hexadezimal ausgegeben wird
        System.out.println("Die Quersumme ihrer Zahl innerhalb des Stellenwertsystems mit der Basis " + basis + " lautet umgewandelt in eine Hexadezimal Zahl: " + ergebnissHex);


    }
}