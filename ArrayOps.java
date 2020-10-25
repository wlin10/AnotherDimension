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

  public static int[] sumCols (int[][] matrix) {
    int[] ans = new int[matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        ans[j] += matrix[i][j];
      }
    }
    return ans;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int[] arr = sumRows(matrix);
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] != arr[i+1]) {
        return false;
      }
    }
    return true;
  }

  public static boolean isColMagic(int[][] matrix) {
    int[] arr = sumCols(matrix);
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] != arr[i+1]) {
        return false;
      }
    }
    return true;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    return (sumRows(matrix)[row] == sumCols(matrix)[col]);
  }

}
