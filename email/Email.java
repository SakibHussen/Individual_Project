package email;

import java.util.Random;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Email {
   private String firstName;
   private String lastName;
   private int uniCode;
   private String password;
   private String department;

   private int mailboxCapacity=500;
   private int defaultPasswordLength;
  private  String alternateEmail;
  private String companySuffix="goucher.edu";
  // Constructor to receive the firstname and lastname
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

        System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);

        //call a method asking for the department>> return the department
        this.department=setDepartment();

        System.out.println("Department: "+this.department);
        //call a method return a random password
        this.uniCode=getUniCode(3);
        this.password=randomPassword(8);
        System.out.println("Your password is:"+this.password);
        //combine element to generate  maill
       String email=firstName.toLowerCase()+lastName.toLowerCase()+uniCode+"@"+department+companySuffix;
        System.out.println("Your Email :"+email);
    }
    //Ask for the department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Devolopment\n3 for Accounting\n0 for none\nEnter the code for Department:");
        Scanner input = new Scanner(System.in);
        int deptchoic = input.nextInt();
        if (deptchoic == 1) {
            return "sale";
        } else if (deptchoic == 2) {
            return "dev";
        } else if (deptchoic == 3) {
            return "acct";
        } else {
            return "";
        }
    }
        //Generate a random password
   private String randomPassword(int length){
        String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";

       // char[] password= new char[length];
       StringBuilder password= new StringBuilder(length);
        for (int i=0; i<length;i++){
            int rand= (int)(Math.random()*passwordSet.length());
            //password[i]= passwordSet.charAt(rand);
            password.append(passwordSet.charAt(rand));
        }
        return password.toString();
   }
   private int getUniCode(int count){
        Random rand= new Random();
       int digit1= rand.nextInt(10);
       int digit2= rand.nextInt(10);
       int digit3= rand.nextInt(10);
       return digit1*100+ digit2*100+digit3*100;

   }

        //Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }

        //set the alternate mail
    public void setAlternateEmail(String atEmail){
        this.alternateEmail=atEmail;
    }

        //change the password
    public void changePassword(String password){
        this.password=password;

    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
}
