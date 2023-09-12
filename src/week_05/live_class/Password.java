package src.week_05.live_class;

import java.util.Date;
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        // Kullanıcı eğer üç kere üst üste yanlış PASSWORD girerse "Access denied !"
        // Kullanıcın yanlış giriş yaptığı zamnları bir stringte toplasın ve kullanıcı başarılı giriş yaptığında kullanıcıyı uyarsın
        // Kullanıcı her yanlış giriş yaptığında şifrenin yanlış olduğunu ve kaç hakkı kaldığını söylesin
        // isAcceesGranted (boolean) --> For  - -> if --> break;  --> else

        Scanner input = new Scanner(System.in);
        Date date = new Date();

        final String PASSWORD = "admin1234";
        final int MAX_ATTEMPT = 3;
        String attemptString = "";
        boolean isAccessGranted = false;


        for (int i = 1 ; i <= MAX_ATTEMPT; i++){

            System.out.print("Enter your PASSWORD : ");
            String userPassword = input.nextLine();

            if(userPassword.equals(PASSWORD)){
                System.out.println("Access granted");
                isAccessGranted = true;

                System.out.println("\n" + attemptString);
                break;
            }else{
                System.out.println("Wrong PASSWORD. Remaining attempt : " + (MAX_ATTEMPT - i));
                attemptString += i + " - " + date.toString() + "\n";
            }

        }
        if(!isAccessGranted){
            System.out.println("Access denied");
        }

    }
}
