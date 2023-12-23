package vendingMachine;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        VendingMachine vendingMachine= new VendingMachine();//new object of vending machine
        Product coke= new Product("Coke",1.5,10);//new class using product constructor
        Product chips= new Product("Chips",2.0,8);

        vendingMachine.addProduct(coke);//adding product into machine
        vendingMachine.addProduct(chips);

        UserInterface ui=new UserInterface();
        Scanner scanner= new Scanner(System.in);

    while(true){
        ui.displayProducts(vendingMachine.products);
        Product selectedProduct=ui.processChoice(vendingMachine.products);
        if (selectedProduct!=null){
            System.out.println("Please Insert coins: ");
            double coinValue= scanner.nextDouble();
            Coin insertCoin= new Coin(coinValue);
            vendingMachine.insertCoin(insertCoin);
            String message= vendingMachine.processTransaction(selectedProduct);
            System.out.println(message);
        }
    }


    }
}
