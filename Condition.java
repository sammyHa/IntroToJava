import java.util.*;
public class Condition {
    public static void main(String[] args) {
        int bonus , goodssold;

        Scanner input = new Scanner(System.in);

        System.out.print(" Please Enter Goods Solde: " );

        goodssold = input.nextInt();

        if(goodssold >= 500000){
            bonus = 10000;
        System.out.println("Hoo Yaaa!!!! you got bonus of = $" + bonus);
        }

        if (goodssold < 500000){

            System.out.println("Sorry You don't get bonus! Goods solde is only $" + goodssold);
        }

    }
}
