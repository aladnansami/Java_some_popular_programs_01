/* Question: 3. Suppose, in a company , here are some employee salaries in an array
        [35000, 25000, 28000, 32500, 44000, 32800]
        Find out the 3rd highest salary*/


package Array_Function;

import java.util.Arrays;

public class third_Largest_Number_array {
    public static int getThirdLargest(int[] emp_salary, int total){
        Arrays.sort(emp_salary);
        return emp_salary[total-3];
    }
    public static void main(String args[]){
        int emp_salary[]={35000, 25000, 28000, 32500, 44000, 32800};
        System.out.println("Third Largest: "+getThirdLargest(emp_salary,6));

    }
}
