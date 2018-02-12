import java.util.Scanner;
public class Exercise03_23 {
    public static void main(String[] args) {
        double x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();
        boolean withinRectangle = (Math.sqrt(Math.pow(x,2)) <= 10/2 || (Math.pow(y,2)) <= 5.0/2);
        System.out.println("Point (" + x + ", " + y + ") is " + ((withinRectangle) ? "in " : " not in ") + "the rectangle");
    }
}