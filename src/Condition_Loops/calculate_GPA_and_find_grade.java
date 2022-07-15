/*Question: 2. Write a program to calculate GPA and find grade?
 Hello This is Al Adnan Sami from Noakhali Science and Technology University.
 */
package Condition_Loops;

import java.util.Scanner;

public class calculate_GPA_and_find_grade {
 public static void main(String args[])
    {

        int marks[] = new int[4];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);


        for(i=0; i<4; i++) {
            System.out.print("Enter Marks of Subject"+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/4;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A+");
        }
        else if(avg>=70 && avg<80)
        {
            System.out.print("A");
        }
        else if(avg>=70 && avg<60)
        {
            System.out.print("A-");
        }
        else if(avg>=60 && avg<50)
        {
            System.out.print("B");
        }
        else if(avg>=50 && avg<33)
        {
            System.out.print("D");
        }
        else
        {
            System.out.print("F");
        }
    }
}
