import java.util.Scanner;

/**
 * @author: Pirnazarov Shaxriyor
 * Date: 09-January. 2024-year.
 * Week day: Tuesday
 * Time: 20:10
 */
public class mainMenu {

    public static void mainMenuMethod(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1. Biz bilan bog'lanish \uD83D\uDCF1\uD83D\uDCF2.");
        System.out.println(" 2. Kirish.");
        System.out.println(" 3. Bizning firma \uD83C\uDFEB.");
        System.out.println(" 0. Chiqish.");
        System.out.print(" >>> ");

        int a = scanner.nextInt();

        switch (a){
            case 0:
                System.out.println(" Dastur yopildi.");
                break;

            case 1:
                contactUs.contactUsMethod();
                break;

            case 2:
                enterMenu.enterMenuMethod();
                break;
            case 4:
                delivery.deliveryMethod();
                break;
            case 5:
                purchaseMenu.purchaseMenuMethod();
                break;
            case 3:
                ourCompany.ourCompanyMethod();
            default:
                System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz.");
                mainMenuMethod();
                break;
        }
    }
}
