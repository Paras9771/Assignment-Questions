import java.util.*;

public class Question37 {
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        find(a, target, 0, new ArrayList<>(), ans);
        System.out.println(ans);
    }

    static void find(int[] a, int t, int i, List<Integer> curr, List<List<Integer>> ans) {
        if (t == 0) { ans.add(new ArrayList<>(curr)); return; }
        if (t < 0 || i == a.length) return;

        curr.add(a[i]);
        find(a, t - a[i], i, curr, ans);
        curr.remove(curr.size() - 1);
        find(a, t, i + 1, curr, ans);
    }
}
