
// Kayleen Mercer Assignment4B
// CS 121 Spring 2017
// 3/9/2017
// The purpose of this assignment is to calculate payroll

package assignment4b;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Assignment4B
{

    public static void main(String[] args)
    {
     
            String firstName; // string of characters
            String lastName; // string of characters
          
            
            int salary; // initalize salary
            int bonusPer; // initalize bonus percentage
            double weeklyPay; // double weekly pay
            double bonus; // double bonus
            double yearlySalary; // double salary
            final double RATE = 100;
            final int WEEK = 50;
            
            Scanner input = new Scanner(System.in); // input scanner
        
  int payRoll = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 if salary, 2 if hourly, 3 if commission, or 4 to quit"));  
    
      
   do // do while payroll is 1, 2, 3, or 4
   {
           switch (payRoll) // if user indicates 1
       
         {  
        
        case 1:
            
            firstName = JOptionPane.showInputDialog("Enter first name"); // prompt
    
            lastName = JOptionPane.showInputDialog("Enter last name"); // prompt
         
            salary = Integer.parseInt(JOptionPane.showInputDialog("Enter yearly salary amount")); // prompt
            
            while (salary < 35000 || salary > 65000)
            {
           
            JOptionPane.showMessageDialog(null, "You have entered an invalid amount, please try again");
            salary = Integer.parseInt(JOptionPane.showInputDialog("Enter yearly salary amount")); // prompt
           
            } 
            
            bonusPer = Integer.parseInt(JOptionPane.showInputDialog("Enter company's annual profit bonus, ex: if profit bonus is 5%, enter 5")); // input profit bonus
            
            bonus = salary * bonusPer/RATE; // calculate bonus
            
            yearlySalary = salary + bonus; // calculate yearly salary
            
            weeklyPay = yearlySalary/WEEK; // calculate weekly pay
            
            JOptionPane.showMessageDialog(null, firstName + " " + lastName); // program prompt
            
            String message = String.format("Your paycheck for this week with bonus is %.2f ", weeklyPay); // prompt
            JOptionPane.showMessageDialog(null, message);
            
            payRoll = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 if salary, 2 if hourly, 3 if commission, or 4 to quit"));
            break;
           
           }

         switch (payRoll) // if user indicates 2
         
     { 
         case 2:   
            
            double payRegular; // double regular pay
            double payWeekly; // double pay per week
            double overTime; // double overtime worked
            final double OVERTIMERATE = 1.5;
         
         firstName = JOptionPane.showInputDialog("Enter first name"); // prompt
           
         lastName = JOptionPane.showInputDialog("Enter last name"); // prompt
           
         double hourlyAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly amount"));
         
          while (hourlyAmount < 1 || hourlyAmount > 25)
         {
            JOptionPane.showMessageDialog(null, "You have entered an invalid amount, please try again");
            hourlyAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly amount"));
         
         }
         
         double hours = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked"));
         
         if (hours <= 40) // if hours worked is less than 40
        
         {
         
         payRegular = hours * hourlyAmount; // calculate regular pay
         
         JOptionPane.showMessageDialog(null, firstName + " " + lastName); // program prompt
         
         String message = String.format("Your paycheck for this week is %.2f ", payRegular); // prompt
         JOptionPane.showMessageDialog(null, message);
         payRoll = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 if salary, 2 if hourly, 3 if commission, or 4 to quit")); 
         break;
         
         }
         
         if (hours > 40) // if hours worked is greater than 40
        {
          
          payRegular = 40 * hourlyAmount; // calculate regular pay
          
          overTime = (hours - 40) * (hourlyAmount* OVERTIMERATE); // calculate overtime
         
          payWeekly = payRegular + overTime; // caculate weekly pay
          
          JOptionPane.showMessageDialog(null, firstName + " " + lastName); // program prompt
          
          String message = String.format("Your regular paycheck is %.2f", payRegular); // prompt
          JOptionPane.showMessageDialog(null, message);
          
          String message1 = String.format("Your overtime amount is %.2f", overTime); // prompt
          JOptionPane.showMessageDialog(null, message1);
          
          String message2 = String.format("Your weekly paycheck is %.2f", payWeekly); // prompt
          JOptionPane.showMessageDialog(null, message2);
          
          payRoll = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 if salary, 2 if hourly, 3 if commission, or 4 to quit"));
          break;
         }
         
   
     }  
         switch (payRoll) // if user indicates 3
        {      
        
        case 3:
            
            int itemsSold;     
            double costPerItem; // double cost per item
            double totalPay; // double total paycheck
            double commission; // double commission
            final double PERCENTRATE = .1;
            double totalSold; // double total items sold
            final int BASEPAY = 200;
           
        firstName = JOptionPane.showInputDialog("Enter first name"); // prompt
           
        lastName = JOptionPane.showInputDialog("Enter last name"); // prompt
        
        itemsSold = Integer.parseInt(JOptionPane.showInputDialog("Enter number of items"));
        
        while (itemsSold > 500 || itemsSold < 1)
        {
        
        JOptionPane.showMessageDialog(null, "You have entered an invalid number, please try again");
        itemsSold = Integer.parseInt(JOptionPane.showInputDialog("Enter number of items"));
            
        }        
        costPerItem = Double.parseDouble(JOptionPane.showInputDialog("Enter cost per item"));
        
        totalSold = itemsSold * costPerItem; // calculate cost of total number of items
        
        commission = totalSold * PERCENTRATE; // calculate commission
        
        totalPay = BASEPAY + commission; // caculate total pay
         
        JOptionPane.showMessageDialog(null, firstName + " " + lastName); // program prompt
        
        String message = String.format("The total amount for items sold is %.2f", totalSold); // prompt
        JOptionPane.showMessageDialog(null, message);
        
        String message1 = String.format("Your commission amount is %.2f%n", commission); // prompt
        JOptionPane.showMessageDialog(null, message1);
        
        String message2 = String.format("Your weekly paycheck is %.2f%n", totalPay); // prompt
        JOptionPane.showMessageDialog(null, message2);
         
      payRoll = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 if salary, 2 if hourly, 3 if commission, or 4 to quit"));
      break;
         } 
         
         do
     
         {
         if (payRoll < 1) // if user indicates a number less than 1
        {
            JOptionPane.showMessageDialog(null, "You have entered an invalid number, please try again"); // prompt
            
            payRoll = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 if salary, 2 if hourly, 3 if commission, or 4 to quit"));
        }
        
       
         if (payRoll > 4)
         {
             JOptionPane.showMessageDialog(null, "You have entered an invalid number, please try again"); // prompt
             
             payRoll = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 if salary, 2 if hourly, 3 if commission, or 4 to quit"));
         }
        
       } while (payRoll < 1 || payRoll > 4);
         
         switch (payRoll) // if user indicates to quit the program
        {
             case 4:
             JOptionPane.showMessageDialog(null, "You have quit the program, have a nice day!"); // prompt
            
         }
    
   } while (payRoll <= 3); // while payroll is 1, 2, 3, or 4
    
    
    
        
    } // end main method
    
} // end class comparison









