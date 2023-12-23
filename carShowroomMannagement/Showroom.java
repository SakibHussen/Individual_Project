package carShowroomMannagement;

import java.util.Scanner;

public class Showroom implements utility {
    String showroom_name;
    String getShowroom_address;
    int total_employees;
    int total_car_stock=0;
    String manager_name;
    @Override
    public void get_details() {
        System.out.println("Showroom Name: "+showroom_name);
        System.out.println("Showroom Address: "+getShowroom_address);
        System.out.println("Manager Name: "+manager_name);
        System.out.println("Total Employees: "+total_employees);
        System.out.println("Total Car In Stock: "+total_car_stock);
    }

    @Override
    public void set_details() {
        Scanner input= new Scanner(System.in);
        System.out.println("*====================== *** ENTER SHOWROOM DETAILS *** =====================");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        showroom_name= input.nextLine();
        System.out.print("SHOWROOM ADDRESS: ");
        getShowroom_address= input.nextLine();
        System.out.print("MANAGER NAME: ");
        manager_name= input.nextLine();
        System.out.print("TOTAL EMPLOYEE");
        total_employees= input.nextInt();
        System.out.print("TOTAL CAR IN STOCK: ");
        total_car_stock=input.nextInt();


    }
}
