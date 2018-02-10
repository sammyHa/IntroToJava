import java.util.Scanner;
public class IfElseSoldYesterDaySoldToday {
    public static void main(String[] args) {
        int soldyesterday =30, soldtoday =20, saleTrends;

        //Scanner input = new Scanner(System.in);

        if(soldyesterday > soldtoday){
            saleTrends= -1;
            System.out.println("saleTrends Yesterday= " + saleTrends);

        }else {
            saleTrends =1;
            System.out.println("saleTrends today = " + saleTrends);
        }

    }
}
