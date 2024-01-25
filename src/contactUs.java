import javax.print.MultiDocPrintService;
import java.util.Scanner;

/**
 * @author: Pirnazarov Shaxriyor
 * Date: 09-January. 2024-year.
 * Week day: Tuesday
 * Time: 20:12
 */
public class contactUs {
    public static void contactUsMethod(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1.Telefon raqam +998911199999 \uD83D\uDCF2.");
        System.out.println(" 2.Telefon raqam +998991199999 \uD83D\uDCF2.");
        System.out.println(" 0.Orqaga qaytish \uD83D\uDC48\uD83D\uDE29.");
        System.out.print(" >>> ");

        int a = scanner.nextInt();

        switch (a){
            case 0:
                mainMenu.mainMenuMethod();
                break;

            default:
                System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz.");
                contactUsMethod();
                break;
        }
    }
}


