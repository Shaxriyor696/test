import java.util.Scanner;

/**
 * @author: Pirnazarov Shaxriyor
 * Date: 09-January. 2024-year.
 * Week day: Tuesday
 * Time: 20:12
 */
public class enterMenu {
    public static void enterMenuMethod(){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1.Jami moshina soni.");
        System.out.println(" 2.Moshina turi va tanlash \uD83D\uDE97 \uD83D\uDE99\uD83D\uDEFB.");
        System.out.println(" 3.Mashina sotib olish \uD83D\uDCB5\uD83D\uDCB5.");
        System.out.println(" 0.Orqaga qaytish \uD83D\uDC48\uD83D\uDE29.");
        System.out.print(" >>> ");

        int a = scanner.nextInt();

        switch (a){
            case 0:
                mainMenu.mainMenuMethod();
                break;
            case 1:
                numberOfCars.numberOfCarsMethod();
                break;
            case 2:
                carTypeAndNumber.carTypeAndNumberMethod();
                break;
            case 3:
                purchaseMenu.purchaseMenuMethod();
                break;

            default:
                System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz.");
                enterMenuMethod();
                break;
        }

    }
}
