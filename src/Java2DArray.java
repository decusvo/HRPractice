import java.util.Scanner;

public class Java2DArray {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(largestHourglassSum(arr));

        scanner.close();
    }

    static int largestHourglassSum(int[][] arr) {

        int largestSum = -9000;

        for (int i = 0; i < 6; i++) {

            try {
                for (int j = 0; j < 6; j++) {
                    int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                    if (sum > largestSum) {
                        largestSum = sum;
                    }
                }
            } catch (Exception ignored) {}

        }
        return largestSum;

    }
}



