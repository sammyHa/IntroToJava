import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        int status ;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Year: " );
        status = input.nextInt();


        switch (status) {
            case 200:
                System.out.println("OK (fulfilled)");
                break;
            case 403:
                System.out.println("forbidden");
                break;
            case 404:
                System.out.println("not found");
                break;
            case 500:
                System.out.println("server error");
            default:
                System.out.println("You have entered wrong number!");

        }

    }
}
