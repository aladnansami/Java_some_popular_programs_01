/*Question:9. Write a program to sum of user input until users input ‘q’ from keyboard?
 Hello This is Al Adnan Sami from Noakhali Science and Technology University.
 */

package java_class_2;

import java.util.Scanner;

public class sum_of_user_input_until_users_input_q {
    public static void main(String[] args) {

        int i = 0;
        double num;
        double sum = 0;
        char choice = ' ';

        Scanner scanner = new Scanner(System.in);

        try {
            for (i = 1; i >= 1; i++) {

                System.out.println("Enter a number:" + " ");

                num = scanner.nextDouble();
                sum += num;
                i++;

                System.out.println("Do you want to exit? press q || For Continue press c");
                choice = scanner.next().charAt(0);
                if (choice == 'q') {
                    break;
                } else if (choice == 'c') {
                    continue;

                }
                scanner.close();
            }

        } catch (Exception e) {
            System.out.println("Please enter valid ");
        }
        System.out.println("Sum of users" + " " + sum);

    }
    }

