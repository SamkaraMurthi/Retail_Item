/** Kadek Narayana 60092
 * January 10, 2022
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class RetailMain {

    public RetailMain(String itemDesc, int units, double price) {
    }

    public static void main(String[] args) throws Exception {
        Scanner keyboardInput = new Scanner(System.in);
        String itemDesc;
        int units;
        double price;

        System.out.println("Input the item description : ");
        itemDesc = keyboardInput.nextLine();
        System.out.println("Input the units on hand : ");
        units = keyboardInput.nextInt();
        while (units < 0) {
            try {
                if (units < 0) {
                    throw new NegativeUnits(units);
                }
            } catch (NegativeUnits e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Input the units on hand : ");
            units = keyboardInput.nextInt();
        }

        System.out.println("Input the item price : ");
        price = keyboardInput.nextDouble();

        while (price < 0) {
            try {
                if (price < 0) {
                    throw new NegativePrice(price);
                }
            } catch (NegativePrice e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Input the item price : ");
            price = keyboardInput.nextDouble();
        }

        RetailItem isidata = new RetailItem(itemDesc, units, price);

        System.out.println("Item Name :" + isidata.getDescription());
        System.out.println("Unit On Hand Total :" + isidata.getUnitsOnhand());
        System.out.println("Item Price :" + isidata.getPrice());
    }
}
