import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("EMPLOYEE RECORD MANAGEMENT SYSTEM");
        System.out.println("1. Add Employee");
        System.out.println("2. View Employee");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Employee added successfully.");
        } 
        else if (choice == 2) {
            System.out.println("Employee details displayed.");
        } 
        else {
            System.out.println("Thank you!");
        }
    }
}
