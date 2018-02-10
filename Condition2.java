import java.util.Scanner;
public class Condition2 {
    public static void main(String[] args) {
        int outsideTemperature, shelfLift=30;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter outside Temperature: " );

        outsideTemperature = input.nextInt();
        if (outsideTemperature > 90){
            shelfLift -=4;
        }
        System.out.println("shelfLift = " + shelfLift);
    }
}
