import java.util.Scanner;
public class Exercise02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minutes;
        System.out.print("Enter the number of minutes: ");
        minutes = input.nextInt();
        int Year = (minutes/60)/(24)/365;
        int Days = (minutes/60)/(24) % 365;
        System.out.println(minutes + " minutes is approximately " + Year + " years and " + Days + " days");
    }
}
