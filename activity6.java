
import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FLORENCE
 */
public class activity6 {
     public static void main(String[] args){
         System.out.println("Welcome to XYZ BANK");
          System.out.println("Chose from the following accounts");
           System.out.println("1. REGULAR ACCOUNT");
            System.out.println("2. INTEREST ACCOUNT");
                System.out.println("3. CHECKING ACCOUNT");    
                        System.out.println("4. CD ACCOUNT");
                        Scanner scn = new Scanner(System.in);
                         System.out.println("ENTER PIN");
                        int pin  = scn.nextInt();
                        switch(pin){
                            case 1:
                               System.out.println("Charges are 10% of the balance at the end of  the month");
                                System.out.println("NO interest");
                                 System.out.println("Penalty of 10.00 when the balance goes below a minimum of 50000.00");
                          break;
                            case 2:
                                 System.out.println("Charges a fee which is 10% of the balance at the end of the month");
                                System.out.println("Interest is 7% and is paid monthly");
                                 System.out.println("Theres no minimum balance required");
                                 break;
                            case 3:
                             System.out.println("Annual interst of 7% and is paid monthly");
                                System.out.println("Penalty of 10.00 if balance falls below 10000.00");
                                 System.out.println("Charges of 0.10 for each transaction");
                                 break;
                            case 4:
                             System.out.println("Charges of 10% of the balance");
                                System.out.println("Interest of 15%");
                                 System.out.println("No minimum balance");
                                  System.out.println("Penalty is 20% of the current balance if you withdaraw before 12months");
                                 break;
                            default:
                                 System.out.println("WRONG PIN");
                                 main(null);
                                break;
                                }
                        
         
     }
}
Thank you
Marked 
Continue
