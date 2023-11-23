package Task01;

public class Main {

    public static void main(String[] args) {

        double[] temperature = new double[]{27.5, 33.2, 14.23, 7.08, 11};
        int count = 0;

        for (int i = 0; i < temperature.length; i += 1) {
            count += 1;
            System.out.printf("%d) Temperature of day %d: %.2f deg.\n",
                    count, count, temperature[i]);
        }
    }
}
