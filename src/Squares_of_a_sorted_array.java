import java.util.Arrays;

public class Squares_of_a_sorted_array {
  /*  public static int[] sortedSquares(int[] A) {
        int N = A.length;
        int[] ans = new int[N];

        for(int i = 0; i < N; i++) {
            ans[i] = A[i] * A[i];
        }
        Arrays.sort(ans);
        return ans;
    } */

  public static int[] sortedSquares(int[] A) {
      int N = A.length;
      int j = 0;
      while(j < N && A[j] < 0)
          j++;
          int i = j - 1;

          int[] ans = new int[N];
          int t = 0;

          while (i >= 0 && j < N) {
              if(A[i] * A[i] < A[j] * A[j]) {
                  ans[t++] = A[i] * A[i];
                  i--;
              } else {
                  ans[t++] = A[j] * A[j];
                  j++;
              }
          }
          while(i >= 0) {
              ans[t++] = A[i] * A[i];
              i--;
          }
          while (j < N) {
              ans[t++] = A[j] * A[j];
              j++;
          }
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
