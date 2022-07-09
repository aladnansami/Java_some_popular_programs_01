/*Question:7. Write a program to print prime numbers from 2 to n?
 Hello This is Al Adnan Sami from Noakhali Science and Technology University.
 */

package java_class_2;

import java.util.Scanner;

public class print_prime_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";
        System.out.println("Enter the value :");
        int n = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to n are :");
        System.out.println(primeNumbers);
    }
    }

