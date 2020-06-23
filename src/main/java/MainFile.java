import java.util.Scanner;

import static java.lang.System.load;

public class MainFile {
    private static int age;
    private static String full_name;
    private static String comments;

    public static void main (String [] args) throws Exception {

     Scanner scan = new Scanner(System.in);

     System.out.println("Please enter your full_names ");
     full_name = scan.nextLine();

     System.out.println("Please enter your age");
     age = scan.nextInt();

     System.out.println("Please state your reason for visiting");
     comments = scan.next();

     System.out.println("Thank you");
     String pov2 = scan.nextLine();

     Visitor.Save("");
        System.out.println();

     System.out.println("if there's any document you would like to view, please enter y (yes) or n (no)");
     String answer = scan.nextLine().toLowerCase();

     if(answer.equals("y")){
         System.out.println();
         System.out.println("Enter the details of the person you would like to view");
         String name = scan.next();
         load(name);
     }else {
         System.out.println("Thank you for visiting");
     }
 }
}
