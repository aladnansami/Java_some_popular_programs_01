
/* Question-2. Input an amount from the user and find out the number of notes from input amount in given array
[1000,500,100,50,20,10,5,2,1]
Input: 1256
Output:
1000 1
100 2
50 1
2 3*/

package Array_Function;

import java.util.Scanner;

public class find_out_the_number_of_notes {
    public static void main(String[] args)
    {

        int totalAmount;
        //total amount declared
        System.out.println("Enter amount:");
        Scanner scanner=new Scanner(System.in);
        totalAmount=scanner.nextInt();

        //different types of note value stored in an array
        int arr[] = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int temp = totalAmount;

        for(int i = 0; i < 8; i++)
        {
            System.out.println("Number of "+arr[i]+" notes = "+temp / arr[i]);
            temp = temp % arr[i];
        }

    }
}
