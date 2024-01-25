import java.util.Scanner;

/**
 * @author: Pirnazarov Shaxriyor
 * Date: 09-January. 2024-year.
 * Week day: Tuesday
 * Time: 20:13
 */
public class numberOfCars {
    public static void numberOfCarsMethod(){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1.BMW-jami 50.");
        System.out.println(" 2.MERS-jami 45.");
        System.out.println(" 3.GM moshi 100.");
        System.out.println(" 4.wols wagen 30.");
        System.out.println(" 5.Lexsus 35.");
        System.out.println(" 0.Orqaga qaytish.");
        System.out.print(" >>> ");

        int a = scanner.nextInt();

        switch (a){
            case 0:
                enterMenu.enterMenuMethod();
                break;

            default:
                System.out.println(" Siz mavjud bo'lmagan buyrug'ni tanladingiz.");
                numberOfCarsMethod();
                break;
        }

    }
}
