/*Question: 1. Write a program to check if inputted letter is small or capital?
 Hello This is Al Adnan Sami from Noakhali Science and Technology University.
 */

package java_class_2;

import java.util.Scanner;

public class check_inputted_letter_small_big {
    public static void main(String[] args) {
        char charecter;
        System.out.println("Enter your letter.");
        Scanner scan=new Scanner(System.in);
       charecter= scan.next().charAt(0);

        if (charecter>='A' && charecter<='Z'){
            System.out.println(charecter+" is an upper case letter ");
        } else if (charecter>='a' && charecter<='z') {
            System.out.println(charecter+"is a lower case letter");
        }
        else {
            System.out.println(charecter+"not an alphabet");
        }
    }
}
