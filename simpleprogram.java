import java.util.Scanner;
public class simpleprogram {
    public static void main(String[] args) {
       double c, f ;


       //Converts F to C
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter Far: ");
        f = scanner.nextDouble();
        c = (5.0/9.0 )* (f - 32);

        System.out.println("celcuis = " + c);



        //Convert C to F
        System.out.println("Please Enter C: " );
        c = scanner.nextDouble();

        f = c*(9.0/5.0)+32;
        System.out.println("f = " + f);

       int strawsOnCamel = 9;
       strawsOnCamel = --strawsOnCamel;
        System.out.println("strawsOnCamel = " + (int)(24.768 * 100)/100.0);

    }

}
