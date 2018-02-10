import java.util.Scanner;
public class ConitionIfElese {
    public static void main(String[] args) {

        int age, seniorCitizen=1, nonSenior=1;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter age: ");
        age = input.nextInt();

        if(age >= 65){
            seniorCitizen +=1;
            System.out.println("seniorCitizen = " + seniorCitizen);
        }else {
            nonSenior +=1;
            System.out.println("nonSenior = " + nonSenior);
        }


    }
}
