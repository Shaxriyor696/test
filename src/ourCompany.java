
import java.util.Scanner;

/**
 * @author: Pirnazarov Shaxriyor
 * Date: 09-January. 2024-year.
 * Week day: Tuesday
 * Time: 20:14
 */
public class ourCompany {
    public static void ourCompanyMethod(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1.Bizning Litsenziyamiz.");
        System.out.println(" 2.Bizga hamkor Banklar.");
        System.out.println(" 3.Bizga hamkor Firmalar.");
        System.out.println(" 4.Bosh menyuga qaytish.");
        System.out.println(" 0.Orqaga qaytish.");
        System.out.print(" >>> ");

        int a = scanner.nextInt();

        switch (a){
            case 3:
                mainMenu.mainMenuMethod();
                break;

            default:
                System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz.");
                ourCompanyMethod();
                break;
        }
    }
}
