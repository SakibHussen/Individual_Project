package vendingMachine;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public void displayProducts(ArrayList<Product>products){
        for(Product product:products){
            System.out.println(product.name+" -$"+product.price);
        }
    }
    public Product processChoice(ArrayList<Product>products){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Select a product: ");
        String choice= scanner.nextLine();

        for (Product product: products){
            if(product.name.equalsIgnoreCase(choice)){
               return product;

            }
        }
        return null;
    }
}
