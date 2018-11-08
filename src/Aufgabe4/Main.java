package Aufgabe4;

public class Main
{
    // statische variable der klasse Main, ohne instanz drauf zugreifbar;
    private static String fh_kufstein_tirol;

    // Ein möglicher Startpunkt der Anwendung
    public static void main(String[] args)
    {
        //fh = Fachhochschule
        fh_kufstein_tirol = "Fachhochschule Kufstein Tirol";

        //Gibt Text in die aktuelle Ausgabe(Console) aus --> Escape zeichen \
        System.out.println( "Java verwendet für Strings\"doppelte Anführungszeichen\"und einzelne Anführungszeichen\n" +
                "wie 'c' um einzelne Zeichen zu definieren.");

        //Gibt Text in die aktuelle Ausgabe(Console) aus --> Escape zeichen \
        System.out.println("Durch \\ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\\\\\");

        //Gibt Text in die aktuelle Ausgabe(Console) aus --> Escape zeichen \
        System.out.println("Ich verwende den\\b Backspace, die Newline\\n und den \\tTabulator");

        //Gibt Text in die aktuelle Ausgabe(Console) aus --> Escape zeichen \
        System.out.println("Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \\r überschreibt\n" +
                "die bestehende Zeile.\\f ist in der Konsole nicht bemerkbar,da es einen Seitenumbruch\n" +
                "erzwingt.");
    }
}
