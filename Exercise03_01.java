import java.util.Scanner;
public class Exercise03_01 {

    public static void main(String[] args) {
        double r1, r2;
        double a  ,b ,c  ;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        double  discrimnant = Math.pow(b,2) - 4 * a * c;
        r1 = (-b + (Math.sqrt(discrimnant)))/2 * a;
        r2 = (-b - (Math.sqrt(discrimnant)))/2 * a;

        if(discrimnant > 0){
            System.out.println("The equation has two roots " + r1 + " and " + r2 );
        } else if(discrimnant == 0){
            System.out.println("The equation has one roots " + r1);
        }
        else {
            System.out.println("The equation has no real roots");
        }

    }
}
