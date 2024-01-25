import java.util.Scanner;

/**
 * @author: Pirnazarov Shaxriyor
 * Date: 09-January. 2024-year.
 * Week day: Tuesday
 * Time: 20:14
 */
public class purchaseMenu extends dataBase {

    public static void purchaseMenuMethod(){
        Scanner scanner = new Scanner(System.in);

        System.out.print(" \uD83C\uDFAB -> Pasport (AA1234567): ");
        String userIDCard = scanner.nextLine();

        System.out.print(" \uD83D\uDC68\u200D\uD83D\uDCBB -> Ishlash joyingiz: ");
        String userWorkPlace = scanner.nextLine();

        System.out.print(" \uD83D\uDE98\uD83D\uDC49\uD83D\uDD35 -> Moshina turi : ");
        String userCarType = scanner.nextLine();

        System.out.print(" \uD83D\uDE98\uD83D\uDC49\uD83D\uDD35 -> Moshina  rangi: ");
        String userCarColor = scanner.nextLine();

        System.out.print(" \uD83D\uDCB3\uD83D\uDCB0 -> To'lovni amalga oshiring: ");
        String makePayment = scanner.nextLine();
        //System.out.print(" \uD83D\uDED2\uD83D\uDED2 -> Yetkazib berish: ");

        UserIDCard.add(userIDCard);
        UserWorkPlace.add(userWorkPlace);
        UserCarType.add(userCarType);
        UserCarColor.add(userCarColor);
        UserMakePayment.add(makePayment);


        System.out.println("Sizning malumotlaringiz yozib olindi!");

        delivery.deliveryMethod();

       // public static void checkUserFirstNameMethod(){
            //Scanner //scanner = new Scanner(System.in);

            System.out.print(" \uD83D\uDC68\u200D\uD83D\uDCBC -> Ism: ");
            String userFirstName = scanner.nextLine();

            if (userFirstName.length() > 3){
                for (int i = 0; i < userFirstName.length(); i++) {
                    if(Character.isDigit(userFirstName.charAt(i))){
                        System.out.println(" Siz isim yozganda raqamdan foydalandingiz! ");
                        System.out.println(" Iltimos qaytdan ismini kirting! ");
                       // checkUserFirstNameMethod();
                    }
                }if(Character.isLowerCase(userFirstName.charAt(0))){
                    System.out.println(" Siz kirtgan ismini birinchi harfi kichik harda ekan! ");
                    System.out.println(" Bu katta harfda bo'lishi kerak. ");
                    System.out.println(" Iltimos qaytdan ismini kirting! ");
                   // checkUserFirstNameMethod();
                }

                UserFirstName.add(userFirstName);
            }else {
                System.out.println(" Siz noto'ri ism kirtdingiz. Kamida 3 ta beligi bo'lishi kerak. ");
                System.out.println(" Iltimos qaytdan ismini kirting! ");
                //checkUserFirstNameMethod();
            }

        }

    }

