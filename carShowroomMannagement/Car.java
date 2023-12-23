package carShowroomMannagement;

import java.util.Scanner;

public class Car extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmissions;

    @Override
    public void get_details() {
        System.out.println("CAR NAME:"+car_name);
        System.out.println("CAR COLOR: "+car_color);
        System.out.println("CAR FUEL TYPE: "+car_fuel_type);
        System.out.println("CAR PRICE: "+car_price);
        System.out.println("CAR TRANSMISSION: "+car_transmissions);
    }

    @Override
    public void set_details() {
        Scanner input= new Scanner(System.in);
        System.out.println("* ======================= *** ENTER CAR DETAILS *** ======================= *");
        System.out.print("ENTER CAR NAME: "+car_name);
        car_name=input.nextLine();
        System.out.print("ENTER XAR COLOR: "+car_color);
        car_color= input.nextLine();
        System.out.print("ENTER CAR FUEL TYPE(PETROL/DIESEL): "+car_fuel_type);
        car_fuel_type= input.nextLine();
        System.out.print("ENTER CAR PRICE: ");
        car_price= input.nextInt();
        System.out.print("TRANSMISSION(AUTO/MANUAL");
        car_transmissions= input.nextLine();
        total_car_stock++;


    }
}
