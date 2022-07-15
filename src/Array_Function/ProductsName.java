/*Question 4. Create your todays bazar list/pocket expenditure which includes the item name and price.
Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price. If found no item, then print message as "No item found" and another function named totalSum() which will return total price of items.*/

package Array_Function;

import java.util.HashMap;
import java.util.Scanner;

public class ProductsName {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        ProductsName productName = new ProductsName();
        System.out.println(productName.searchItem(str));


    }
    public static int searchItem(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Soap", 40);
        map.put("Onions", 80);
        map.put("Noodles", 20);
        Integer a = null;
        if (map.containsKey(str)) {
            a = map.get(str);

        }
        return a;
    }
}
