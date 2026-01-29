import java.util.Scanner;

public class console {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = scan.nextLine();
        
        System.out.print("Enter student age: ");
        int age = scan.nextInt();
        scan.nextLine();
        
        System.out.print("Enter student grade: ");
        String grade = scan.nextLine();
        
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        
        scan.close();
    }
}
