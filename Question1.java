//   Question 2 : Write a program to find the sum of elements in a given range [L, R] using a prefix sum array.
    import java.util.Scanner;
    public class Question1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] prefix = new int[n];
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            prefix[0] = arr[0];
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + arr[i];
            }
            System.out.print("Enter L (start index): ");
            int L = sc.nextInt();
            System.out.print("Enter R (end index): ");
            int R = sc.nextInt();
            int rangeSum;
            if (L == 0) {
                rangeSum = prefix[R];
            } else {
                rangeSum = prefix[R] - prefix[L - 1];
            }
            System.out.println("Sum from index " + L + " to " + R + " is: " + rangeSum);
        }
    }
