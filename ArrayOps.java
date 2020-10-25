public class ArrayOps{

  public static int sum(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      ans += arr[i];
    }
    return ans;
  }

  public static int largest(int[] arr) {
    int ans = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > ans) {
        ans = arr[i];
      }
    }
    return ans;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] ans = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      ans[i] += sum(matrix[i]);
    }
    return ans;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] ans = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      ans[i] += largest(matrix[i]);
    }
    return ans;
  }

  public static int sum(int[][] arr) {
    int ans = 0;
    int[] sums = sumRows(arr);
    for (int i = 0; i < sums.length; i++) {
      ans += sums[i];
    }
    return ans;
  }

}
