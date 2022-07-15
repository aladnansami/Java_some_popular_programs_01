/* Question-1. Take input from a user and check if the number exists in the array
        let the array is [1,3,5,7,2,4,6,8]
        Input: 7
        Output: Found in the position 3
        Input: 9
        Output: Found no element*/

package Array_Function;

import java.util.Arrays;
import java.util.Scanner;

public class element_exists_in_an_array {
    public static boolean check(int[] arr, int val) {
        boolean b = false;


        for(int i : arr){
            if(i == val){
                b = true;
                break;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println("Enter your value to check: ");
        Scanner scanner = new Scanner(System.in);
       int val=scanner.nextInt();
        int[] arr = {1,3,5,7,2,4,6,8};

        if(check(arr, val)){
            System.out.println(val+" Exists in the array.");
        }
        else {
            System.out.println("Found no element");
        }
    }
}
