
    import java.util.Scanner;

    public class Question4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int totalSum = 0;
            for (int i = 0; i < n; i++) {
                totalSum += arr[i];
            }
            int prefixSum = 0;
            boolean found = false;

            for (int i = 0; i < n - 1; i++) {
                prefixSum += arr[i];
                int suffixSum = totalSum - prefixSum;
                if (prefixSum == suffixSum) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("YES, array can be split into equal sum parts.");
            } else {
                System.out.println("NO, array cannot be split into equal sum parts.");
            }
        }
    }
