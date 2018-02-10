import java.util.Scanner;
public class ConditionGPA {
    public static void main(String[] args) {
        double gpa ,deansList=10;
        String studentName;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        studentName = input.next();

        System.out.print("Enter GPA: ");
        gpa = input.nextDouble();

        if(gpa > 3.5){
            deansList +=1;
            System.out.println( studentName );
            System.out.println("Deans List is increased by one " + deansList);
        }
        else {
            System.out.println(studentName + "! Your out of Deans List cuz ur gpa is " + gpa);
        }
    }
}
