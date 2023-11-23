package Task04;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static String[] products;
    static String productName;
    static int count;

    public static void main(String[] args) {

        products = new String[]{"meat", "fish", "ham", "salad", "pork", "macaroni", "sandwich", "caviar", "potato"};

        System.out.println("*List of products: " + Arrays.toString(products) + "\n");

        Scanner scProducts = new Scanner(System.in);
        System.out.print("Enter a product name: ");
        productName = scProducts.nextLine();

        for (String product : products) {
            if (product.equals(productName)) {
                count += 1;
            }
        }

        if (count > 0) {
            System.out.println("Product \"" + productName + "\" is available.");
        } else {
            System.out.println("Product \"" + productName + "\" is not available.");
        }
    }
}
