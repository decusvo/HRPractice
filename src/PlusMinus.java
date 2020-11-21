import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PlusMinus {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {


        int total = arr.length;
        int noOfPositives = 0;
        int noOfNegatives = 0;
        int noOfNeutrals = 0;

        for (int i : arr) {

            if (i > 0) {
                noOfPositives++;
            } else if (i < 0) {
                noOfNeutrals++;
            } else {
                noOfNegatives++;
            }

        }
        BigDecimal pos = new BigDecimal(String.valueOf((new BigDecimal(noOfPositives)).divide(new BigDecimal(total), 6, RoundingMode.CEILING)));

        BigDecimal neg = new BigDecimal(String.valueOf((new BigDecimal(noOfNegatives)).divide(new BigDecimal(total), 6, RoundingMode.CEILING)));

        BigDecimal neu = new BigDecimal(String.valueOf((new BigDecimal(noOfNeutrals)).divide(new BigDecimal(total), 6, RoundingMode.CEILING)));


        // Ratio of positive numbers
        System.out.println(pos);
        // Ratio of neutral numbers
        System.out.println(neu);
        // Ratio of negative numbers.
        System.out.println(neg);

    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
