import java.util.Scanner;

/**
 * @author: Pirnazarov Shaxriyor
 * Date: 09-January. 2024-year.
 * Week day: Tuesday
 * Time: 20:13
 */
public class carTypeAndNumber {
    public static void carTypeAndNumberMethod(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1.BMW turi-1)BMW ix M60 2)BMW i7 3)BMW i5 4)BMW i4.");
        System.out.println(" 2.MERS  turi- 1)Mercedes-Benz sls amg 2)Mercedes Benz 300sl.");
        System.out.println(" 3.GM  turi- 1) Malibu 2) Kobalt 3) Gentra 4) Monza  5) Treker  6)Damas.");
        System.out.println(" 4.Volswagen  turi- 1)Caddy Cargo 2)Caddy  Refrigerator.");
        System.out.println(" 5.Lexsus  sani- 1) Toyota Lexsus rx 300.");
        System.out.println(" 6.SOTIB OLISH \uD83D\uDCB0\uD83D\uDCB0\uD83D\uDED2");
        System.out.println(" 0.Orqaga qaytish \uD83D\uDC48\uD83D\uDE29 ");
        System.out.print(" >>> ");

        int a = scanner.nextInt();

        switch (a){
            case 0:
                mainMenu.mainMenuMethod();
                break;
            case 6:
                purchaseMenu.purchaseMenuMethod();
                break;
            default:
                System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz.");
                carTypeAndNumberMethod();
                break;
        }

    }
}
