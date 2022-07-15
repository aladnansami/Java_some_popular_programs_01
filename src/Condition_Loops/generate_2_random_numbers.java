/*Question: Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved.?
 Hello This is Al Adnan Sami from Noakhali Science and Technology University.
 */
package Condition_Loops;

import java.util.Scanner;

public class generate_2_random_numbers {
    public static void main(String[] args) {

        try {
            int userGuessNumber = 0,
                          count = 0;
            int randomNumberOne = (int)(Math.random() * 3 + 2);
            int randomNumberTwo = (int)(Math.random() * 2 + 1);

            System.out.println("Enter your favorite number between 1 to 10" + " "
                                    + "You have 10 chances at a time");

            System.out.println("Enter your number");
            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <= 10; i++) {
                if (scanner.hasNextInt()) {
                    userGuessNumber = scanner.nextInt();
                    if (userGuessNumber == randomNumberOne || userGuessNumber == randomNumberTwo) {
                        count += 1;
                        System.out.println("you get one point");
                    } else if (userGuessNumber < randomNumberOne || userGuessNumber < randomNumberTwo) {
                        System.out.println("your guess number is low");
                    } else if (userGuessNumber > randomNumberOne || userGuessNumber > randomNumberTwo) {
                        System.out.println("your guess number is high");
                    }
                    if (i == 10) {
                        System.out.println("You have exceeded the maximum");
                        break;
                    }
                } else {
                    System.out.println("Enter a valid integer number");
                    break;
                }

            }
            System.out.println("Your get" + " " + count + " " + "points");

            scanner.close();
        } catch (Exception e) {
            System.out.println("Enter valid input");
        }

    }
    }

