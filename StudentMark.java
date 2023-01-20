import java.util.Scanner;

public class StudentMark {

            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the roll number: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); 

           System.out.print("Enter the name: ");
           String name = scanner.nextLine();

          System.out.print("Enter the Physics Mark: ");
          int physics = scanner.nextInt();

          System.out.print("Enter the Chemistry Mark: ");
          int chemistry = scanner.nextInt();

          System.out.print("Enter the Computer Mark: ");  
          int computer= scanner.nextInt();

          int total = physics + chemistry+ computer;

          double percentage = total / 3.0;

          String division = "";
          if (percentage >= 60) {
          division = "First";
}
          else if (percentage >= 50) {
          division = "Second";
}
          else if (percentage >= 40) {
          division = "Third";
} 
          else {
         division = "Fail";
}

         System.out.println("Total: " + total);

        System.out.println("Percentage: " + percentage + "%");

        System.out.println("Division: " + division);

}

}

