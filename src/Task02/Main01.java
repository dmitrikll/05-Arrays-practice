package Task02;

import java.util.Scanner;

public class Main01 {

    static String[] empEven;
    static String[] empOdd;
    static String[] weeks;
    static String day;

    public static void main(String[] args) {

        empEven = new String[]{"Oliver", "Jack", "Harry"};
        empOdd = new String[]{"Agata", "Vanessa", "Bridget"};
        weeks = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        Scanner scannerWeek = new Scanner(System.in);
        System.out.print("Enter the day of the week (Mon, Tue, Wed, Thu, Fri, Sat, Sun): ");
        day = scannerWeek.nextLine();

        System.out.println("On this day, they will be working:");

        for (String week : weeks) {
            if (week.equals(day) && day.equals("Mon") || day.equals("Wed") || day.equals("Fri")) {
                for (String emp : empOdd) {
                    System.out.println(emp);
                }
                break;
            } else if (week.equals(day) && day.equals("Tue") || day.equals("Thu") || day.equals("Sat")) {
                for (String emp : empEven) {
                    System.out.println(emp);
                }
                break;
            } else if (day.equals("Sun")) {
                System.out.println("Today is a day off !");
                break;
            } else if (!week.equals(day)){
                System.out.println("Wrong data...");
                break;
            }
        }
    }
}


