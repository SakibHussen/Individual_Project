package carShowroomMannagement;

import java.util.Scanner;
import java.util.UUID;

public class Employe extends Showroom implements utility {
    String employees_id;
    String employees_name;
    String employees_department;
    int employees_age;

    @Override
    public void get_details() {
        System.out.println("Employer ID: "+employees_id);
        System.out.println("Employer Name"+employees_name);
        System.out.println("Employer Age: "+employees_age);
        System.out.println("Employer Department: "+employees_department);
        System.out.println("Showroom Name: "+showroom_name);

    }

    @Override
    public void set_details() {
        Scanner input= new Scanner(System.in);
        UUID uuid= UUID.randomUUID();
        employees_id=String.valueOf(uuid);
        System.out.println("*======================= *** ENTER EMPLOYEES DETAILS *** =======================*");
        System.out.print("ENTER EMPLOYEES NAME: ");
        employees_name= input.nextLine();
        System.out.println("ENTER EMPLOYEES AGE: ");
        employees_age= input.nextInt();
        System.out.println("ENTER EMPLOYEES DEPARTMENT: ");
        employees_department= input.nextLine();
        System.out.println("SHOWROOM NAME: ");
        showroom_name=input.nextLine();
    }
}
