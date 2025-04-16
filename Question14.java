public class Question14 {
    public static void main(String[] args) {
        int[] a = {1, 3, 8};
        int[] b = {2, 4, 7, 9};
        int n = a.length, m = b.length;
        int total = n + m;
        int i = 0, j = 0, count = 0;
        int prev = 0, curr = 0;

        while (count <= total / 2) {
            prev = curr;

            if (i < n && (j >= m || a[i] < b[j])) {
                curr = a[i++];
            } else {
                curr = b[j++];
            }
            count++;
        }

        double median;
        if (total % 2 == 0) {
            median = (prev + curr) / 2.0;
        } else {
            median = curr;
        }

        System.out.println("Median is: " + median);
    }
}
