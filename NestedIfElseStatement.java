import java.util.Scanner;
public class NestedIfElseStatement {
    public static void main(String[] args) {


        int age, minor =1, adult=1, senior=1;
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter Age: ");
        age = input.nextInt();

        if(age < 18){
            minor ++;
            System.out.println(" minor: "+ minor);
        }else if( age < 65){
            adult++;
            System.out.println(" adult: "+ adult);

        }else {
            senior++;
            System.out.println(" senior: "+ senior);
        }

    }
}
