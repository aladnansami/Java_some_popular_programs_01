package Array_Function;

import java.util.Scanner;

public class find_out_the_average {

        private int Average(int[] a) {
            int i;
            int average;
            int sum=0;



            for (i = 0; i < 5; i++) {
                sum= sum+ a[i];
            }
            average = sum/5;
            return average;

        }

        private int countOddNumbers(int[] a) {


            int i;
            int odd;


            odd = 0;
            for (i = 0; i < 5; i++) {
                if (a[i] % 2 != 0) {
                    odd++;
                }
            }
            return odd;

        }

        private int countEvenNumbers(int[] a) {

            int i;
            int even;


            even = 0;
            for (i = 0; i < 5; i++) {
                if (a[i] % 2 == 0) {
                    even++;
                }
            }
            return even;
        }

    public static void main(String[] args) {
        System.out.println("Enter 5 numbers: ");
        Scanner sc = new Scanner(System.in);
        int i;
        int [] a = new int[5];

        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        find_out_the_average m = new find_out_the_average();
        System.out.println("Even number ="+m.countEvenNumbers(a));
        System.out.println("Odd number ="+m.countOddNumbers(a));
        System.out.println("Avarage of a number ="+m.Average(a));
    }

}

