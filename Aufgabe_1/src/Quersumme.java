public class Quersumme {

    public static int quersumme(int x) {
        int quersumme = 0;
        while (x != 0) {
            if (x % 10 != 0) {
                int ones = x % 10;
                x -= ones;
                quersumme += ones;
            }else if (x % 100 != 0) {
                int tens = (x % 100) / 10;
                x -= tens;
                quersumme += tens;
            } else if (x % 1000 != 0) {
                int hundreds = (x % 1000) / 100;
                quersumme += hundreds;
            }

        }

        return quersumme;
    }

}
