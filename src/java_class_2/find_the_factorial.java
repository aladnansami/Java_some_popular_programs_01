/*Question:5. 6. Write  a program to find the factorial of a given number?
 Hello This is Al Adnan Sami from Noakhali Science and Technology University.
 */

package java_class_2;

import java.util.Scanner;

public class find_the_factorial {
    public static void main(String[] args) {
        int fact=1;
        int i;
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        for ( i = 1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial is "+fact);
    }
}
