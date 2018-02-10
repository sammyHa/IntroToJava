import java.util.Scanner;

public class conditionExpression3_14 {
    public static void main(String[] args) {
        int month;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Month #: ");
        month = input.nextInt();

        System.out.println( month==1 ? "jan" : month==2 ? "feb" : month==3 ?"mar": month==4 ? "apr":
        month==5 ?"may": month==6 ?"jun": month==7 ?"jul": month==8 ?"aug":
        month==9 ?"sep": month==10 ?"oct": month==11 ?"nov": month==12?"dec":null);

        ConditionalExpression3_14_1();
    }


    public static void ConditionalExpression3_14_1(){
        int credits=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Credits: ");
        credits = input.nextInt();

        System.out.println(credits < 30 ? "freshman" : credits >= 30 && credits < 60 ? "sophomore" : credits >= 60 && credits < 90 ? "junior" : "senior");

    }

}

