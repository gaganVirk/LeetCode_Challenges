import java.util.Arrays;

public class Squares_of_a_sorted_array {
    public static int[] sortedSquares(int[] A) {
        int N = A.length;
        int[] ans = new int[N];

        for(int i = 0; i < N; i++) {
            ans[i] = A[i] * A[i];
        }
        Arrays.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-4,-1,0,3,10};
        int[] s = sortedSquares(nums);
        for(int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
