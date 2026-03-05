import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;

public class age {

   public static void main(String [] args) {
   
      Scanner sc = new Scanner(System.in);
   
      LocalDate today = LocalDate.now();
      
      int crntY = today.getYear();
      int crntM = today.getMonthValue();
      int crntD = today.getDayOfMonth();
   
      int year;
      int month;
      int day;
   
      int ageY;
      int ageM;
      int ageD;
   
   
   // year input
   
      while (true) {
         System.out.print("Enter your birth year: ");
         year = sc.nextInt();
      
         if ( year >= 1900 && year <=2025 )
            break; 
         
         else 
            System.out.println("Invalid year. Please try again.\n");
      }
   
   
   // month input
   
      while (true) {
         System.out.print("\nEnter your birth month: ");
         month = sc.nextInt();
      
         if ( month >= 1 && month <= 12 )
            break; 
         
         else 
            System.out.println("Invalid month. Please try again.");
      
      }
   
   
   // day input 
   
      while (true) {
         System.out.print("\nEnter you birth day: ");
         day = sc.nextInt();
      
         if ( month == 2 && day <= 28 || month == 4 && day <= 30 || month == 6 && day <= 30 || month == 9 && day <= 30 
         
             || month == 11 && day <= 30 || month == 1 && day <= 31 || month == 3 && day <= 31 || month == 5 && day <= 31 
             
                  || month == 7 && day <= 31 || month == 8 && day <= 31 || month == 10 && day <= 31 || month == 12 && day <= 31)
         
         {
            {ageY = (crntY - year);
               ageM = (crntM - month);
               ageD = (crntD - day);
            
               if (ageD < 0) {
                  ageM--;
                  int daysInPrevMonth;
                  if (month == 5 || month == 7 || month == 10 || month == 12) daysInPrevMonth = 30;
                  else if (month == 3) daysInPrevMonth = 28;
                  else daysInPrevMonth = 31;
                  ageD += daysInPrevMonth;
               }
            
               {
                  if ( month == 2 && ageD < 0 )
                  { ageM = ageM - 1;
                     ageD = ageD + 28; }
               }
            
               if (ageM < 0) {
                  ageY--;
                  ageM += 12;
               }
               
               else if ( (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 
                   || month == 10 || month == 12) && ageD < 0 )
               
               { ageM = ageM - 1;
                  ageD = ageD + 31; } 
               
               else if ( (month == 4 || month == 6 || month == 9 || month == 11) && ageD < 0 )
               
               { ageM = ageM - 1;
                  ageD = ageD +30; } }
         
            System.out.printf("\nYou are %d years, %d months, and %d days old.", ageY, ageM, ageD);
            break; }
         
         
         else 
         
            System.out.println("Invalid day. Please try again.");
      
      
      }
   
   
   }
}