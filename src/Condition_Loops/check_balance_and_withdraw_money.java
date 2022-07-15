/*Question: 4. Write a program to check balance and withdraw money from ATM booth using if else or switch case?
 Hello This is Al Adnan Sami from Noakhali Science and Technology University.
 */
package Condition_Loops;

import java.util.Scanner;

public class check_balance_and_withdraw_money {
    public static void main(String[] args) {


    int balance = 100000, withdraw, deposit;
    Scanner s = new Scanner(System.in);
     while(true)

    {

        System.out.println("ATM Booth");

        System.out.println("Choose 1 for Withdraw");

        System.out.println("Choose 2 for Deposit");

        System.out.println("Choose 3 for Check Balance");

        System.out.println("Choose 4 for EXIT");

        System.out.print("Choose option:");

        int n = s.nextInt();

        switch(n)

        {

            case 1:

                System.out.print("Enter money to be withdrawn:");

                withdraw = s.nextInt();

                if(balance >= withdraw)

                {

                    balance = balance - withdraw;

                    System.out.println("Please collect your money");

                }

                else

                {

                    System.out.println("Insufficient Balance");

                }

                System.out.println("");

                break;

            case 2:

                System.out.print("Enter money to be deposited:");

                deposit = s.nextInt();

                balance = balance + deposit;

                System.out.println("Your Money has been successfully depsited");

                System.out.println("");

                break;

            case 3:

                System.out.println("Balance : "+balance);

                System.out.println("");

                break;

            case 4:

                System.exit(0);

        }

    }

}
}
