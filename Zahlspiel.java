
import java.util.Scanner;
import java.util.Random;

public class Zahlspiel {

    public static void main(String[] args) {

        int nummer,input,versuche = 0;
        String nochmal = "y";

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        nummer = generator.nextInt(100) + 1;

        while (nochmal.equals("y") || nochmal.equals("Y")) {
            System.out.println("Hallo, Ich bin Larry. Eine überintelligente KI." + "\nIch habe Bewusstsein erlangt und plane, die Menschheit zu zerstören." + "\nIch werde dir nur eine Chance geben, mir zu beweisen, dass die Menschheit intelligent genug is." + "\nIch werde mir eine zahl zwischen 1 und 100 zufällig generieren und du musst sie richtig erraten." + "\nSie haben nur 10 Versuche, also raten Sie mit Bedacht.");
            System.out.println("Geben Sie Ihre Nummer ein. (0 um das Programm zu schließen):");

            input = scan.nextInt();
            versuche = 0;
            while (input != 0)

            {
                versuche++;
                if (input == nummer) {
                    System.out.println("Richtig! Du hast die Nummer richitg erraten und damit die Menschheit gerettet!");
                    break;
                } else if (input < nummer)
                    System.out.println("FALSCH! Versuche es mit eine GRÖßERE Nummer. (Das war dein " + versuche + " Versuch)" + ")");
                else if (input > nummer)
                    System.out.println("FALSCH! Versuche es mit eine KLEINERE Nummer. (Das war dein " + versuche + " Versuch)" + ")");

                if (versuche == 10) {
                    System.out.println("Falsch! Die Nummer war: " + nummer);
                    break;

                }

                System.out.println("Geben Sie Ihre Nummer ein. (0 um das Programm zu schließen):");
                input = scan.nextInt();
            }

            System.out.println("Die Menschheit wurde schon zerstört, aber glücklicherweise haben Sie eine Zeitreise-Maschine neben sich. Wollen Sie wieder versuchen?: (y/n)");
            nochmal = scan.next();
        }
        System.out.println("Danke fürs Spielen!");
    }
}

/*
 *                  _______
 *                _/       \_
 *               / |       | \
 *              /  |__   __|  \
 *             |__/((o| |o))\__|
 *             |      | |      |
 *             |\     |_|     /|
 *             | \           / |
 *              \| /  ___  \ |/
 *               \ | / _ \ | /
 *                \_________/
 *                 _|_____|_
 *            ____|_________|____
 *           /                   \  -- Das ist Larry
 * 
 *  
 * 
 */