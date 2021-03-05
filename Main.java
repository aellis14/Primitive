import java.until.Scanner;
class Main {
  public static void main(String[] args) {
   java.util.Scanner scan = new Scanner(System.in);
   //THE 8 PRINT DATA TYPES
   //intege : Storage whole numbers from -2

   String name = "Adriana";
   System.out.println("Enter you name");
   String answer = scan.next();

   if(name.equals(answer))
   {
     System.out.println("Correct!");
   }else{
     System.out.println("Name does not match.");
   }

   System.out.println("What data type would you use to represent -2,120,743,292 ? ");
   String answer = scan.next();

   if(name.equals(answer))
   {
     System.out.println("Correct!");
   }else{
     System.out.println("try again");
   }
   
   }
 }