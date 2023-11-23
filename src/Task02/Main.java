package Task02;

import java.util.Scanner;

public class Main {

    static String[] empEven;
    static String[] empOdd;
    static String day;

    public static void main(String[] args) {

        empEven = new String[]{"Oliver", "Jack", "Harry"};
        empOdd = new String[]{"Agata", "Vanessa", "Bridget"};

        Scanner scannerWeek = new Scanner(System.in);
        System.out.print("Enter the day of the week (Mon, Tue, Wed, Thu, Fri, Sat, Sun): ");
        day = scannerWeek.nextLine();

        System.out.println("On this day, they will be working:");

        switch (day) {
            case "Mon", "Wed", "Fri":
                for (String emp : empOdd) {
                    System.out.println(emp);
                }
                break;
            case "Tue", "Thu", "Sat":
                for (String emp : empEven) {
                    System.out.println(emp);
                }
                break;
            case "Sun":
                System.out.println("Today is a day off !");
                break;
            default:
                System.out.println("Wrong data...");
        }
    }
}
