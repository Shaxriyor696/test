import javax.print.MultiDocPrintService;
import java.util.Scanner;

/**
 * @author: Pirnazarov Shaxriyor
 * Date: 09-January. 2024-year.
 * Week day: Tuesday
 * Time: 20:15
 */
public class delivery extends dataBase{

    public static void deliveryMethod(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1.Isim.");
        String userName = scanner.nextLine();

        System.out.println(" 2.Telefon raqam.");
        String userYourPhoneNumber = scanner.nextLine();

        System.out.println(" 3.Aniq manzilni kiriting.");
        String userYourLocation = scanner.nextLine();

        System.out.println(" 4.Biz bilan bog'lanish +998919998888.");
        System.out.println(" 0.Bosh menyuga qaytish.");
        System.out.print(" >>> ");

        UserName.add(userName);
        UserYourPhoneNumber.add(userYourPhoneNumber);
        UserYourLocation.add(userYourLocation);

        System.out.println("To'liq Malumotlar yozib olindi! Tez orada siz bilan bog'lanamiz\uD83D\uDE0A\uD83D\uDE0A ");

        int a = scanner.nextInt();
        switch (a){
            case 5:
                purchaseMenu.purchaseMenuMethod();
                break;
            case 0:
                mainMenu.mainMenuMethod();
                break;
            default:
                System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz.");
                deliveryMethod();
        }

    }
}
