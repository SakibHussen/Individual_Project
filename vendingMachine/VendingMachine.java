package vendingMachine;

import java.util.ArrayList;

public class VendingMachine {
    ArrayList<Product>products= new ArrayList<>();
    ArrayList<Coin>cashBox= new ArrayList<>();
    double userBalance;
    public VendingMachine(){
        products = new ArrayList<>();
        cashBox= new ArrayList<>();
        userBalance=0;
    }
    public void addProduct(Product product){
        products.add(product);

    }
    public void insertCoin(Coin coin){
        userBalance+= coin.value;
    }

    public String processTransaction(Product product){
        if (product.quantity<=0){
            return "Sold out";
        }
        if(userBalance >= product.price){
           userBalance-= product.price;
            //System.out.println("There is your changes= "+userBalance);
            product.quantity--;
            return "Transaction successful.Enjoy your "+product.name;
        } else{
            return "Insufficient funds";
        }
    }
}
