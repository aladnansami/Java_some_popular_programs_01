
/* Question-6.
6. Suppose a software system excepts valid credentials from user to logged in to the system.
if the user inputs wrong password for 3 times, system will say that
 "Your user has been temporary locked". Let the username: admin, password: adm1n*/
package Array_Function;

import java.util.Scanner;

public class user_logged_system {
    public static void main(String[] args) {
          Scanner scan = new Scanner (System.in);

        for (int x=0;x<3;x++){
            System.out.print("username: ");
            String username = scan.nextLine();
            System.out.print("password: ");
            String password = scan.nextLine();

            if (username.equals("admin")&&password.equals("adm1n")){
                System.out.print("Is this yours? ");
                String sport = scan.nextLine();
                if (sport.equals("yes")){
                    System.out.println("welcome");
                } else
                    System.out.println("terminated");
                break;
            }
        }
        System.out.println("Your user has been temporary locked");
    }
}

