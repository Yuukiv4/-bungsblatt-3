public class Quersumme {

    public static int quersumme(int x) {
        int quersumme = 0;
        while (x != 0) {
            //Es wird darauf geprüft, ob eine andere zahl als 0 auf der Einser-Stelle liegt
            if (x % 10 != 0) {
                //Die Einer werden aus der gesamten Zahl gefiltert
                int ones = x % 10;
                //Die Einer werden von der gesamten Zahl abgezogen
                x -= ones;
                //Die Einer werden auf die Quersumme addiert
                quersumme += ones;
            //Es wird darauf geprüft, ob eine andere zahl als 0 auf der Zehner-Stelle liegt
            }else if (x % 100 != 0) {
                //Die Zehner werden aus der gesamten Zahl gefiltert
                int tens = (x % 100);
                //Die Zehner werden von der gesamten Zahl abgezogen
                x -= tens;
                //Die Zehner werden auf die Quersumme addiert
                quersumme += tens / 10;
            //Es wird darauf geprüft, ob eine andere zahl als 0 auf der Hunderter-Stelle liegt
            } else if (x % 1000 != 0) {
                //Die Hunderter werden aus der gesamten Zahl gefiltert
                int hundreds = (x % 1000);
                //Die Hunderter werden von der gesamten Zahl abgezogen
                x -= hundreds;
                //Die Hunderter werden auf die Quersumme addiert
                quersumme += hundreds / 100;
            }
        }

        return quersumme;
    }

    public static String quersummeHex (String number, int basis) {
        //i ist die Zähler Variable wie oft die Schleife schon durchgelaufen ist
        int i = 0;
        int quersumme = 0;
        //Schleife die so lange läuft bis jede Stelle der Zahl verarbeitet wurde
        while ( i < number.length() ) {
            //Aufteilung der Zahl in die einzelnen Stellen
            String position = number.substring(i,i+1);
            //Umwandlung der Zahl in Ihrem Stellenwertsystem zu einer Zahl und addition zur Quersumme
            quersumme += Integer.parseInt(position,basis);
            //erhöhung der Zähler Variable um 1
            i += 1;
        }
        //Dieser Ansatz in die Aufteilung der zahl in Substrings, würde auch beim Verfahren in der Funktion quersumme funktionieren, wenn dort die Zahl vorherr als String eingelesen wird statt als Integer

        return (Integer.toHexString(quersumme));

    }

}
