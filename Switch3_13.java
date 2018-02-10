public class Switch3_13 {
    public static void main(String[] args) {
        int age=0;

        switch (age){
            case 0:
            case 1:
                System.out.println("ineligible");
                break;
            case 2:
                System.out.println("toddler");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("early childhood");
                break;
            case 6:
            case 7:
                System.out.println("young reader");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("elementary");
                break;
            case 11:
            case 12:
                System.out.println("middle");
                break;
            case 13:
                System.out.println("impossible");
                break;
            case 14:
            case 15:
            case 16:
                System.out.println("high school");
                break;
            case 17:
            case 18:
                System.out.println("scholar");
                break;
                default:
                    System.out.println("ineligible");
        }
    }

}
