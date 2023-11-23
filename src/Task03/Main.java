package Task03;

public class Main {

    static int[] tickets;
    static int count;

    public static void main(String[] args) {

        tickets = new int[]{1234, 3571, 4763, 9652, 6591};
        for (int ticket : tickets) {
            if (ticket % 2 == 0) {
                count += 1;
                System.out.println(count + ") Winning ticket number is: " + ticket);
            }
        }
    }
}
