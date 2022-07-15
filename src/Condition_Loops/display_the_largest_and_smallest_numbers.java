/*Question:10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.?
 Hello This is Al Adnan Sami from Noakhali Science and Technology University.
 */

package Condition_Loops;

import java.util.Scanner;

public class display_the_largest_and_smallest_numbers {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int num, largeNum = Integer.MIN_VALUE,
            smallNum = Integer.MAX_VALUE;

    char choice;

    try {
        do {
            System.out.println("Enter the number:");
            num = scanner.nextInt();

            if (num > largeNum) {
                largeNum = num;
            }
            if (num < smallNum) {
                smallNum = num;
            }

            System.out.println("your enter number is:" + " " + num);
            System.out.println("Do you want to continue y/n?");
            choice = scanner.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
        System.out.println(largeNum + " " + "is the largest number");
        System.out.println(smallNum + " " + "is the smallest number");
        scanner.close();
    } catch (Exception e) {
        System.out.println("Enter valid Input");
    }
}
}
