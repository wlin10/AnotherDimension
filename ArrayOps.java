public class ArrayOps{

  public static int sum(int[] arr) {
    int ans = 0;
    for (int i = 1; i <= arr.length; i++) {
      ans += arr[i];
    }
    return ans;
  }
