import java.util.Arrays;
public class Tester{
  public static void main(String[]args){
    int[][]  A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
    int[]  B  =   {  1, 3, 5 };
    int[][] X = { {  1,  2, 3, 4 },
                {  2, 3,  4,  1 },
                { 3, 4,  1, 2 } };
    int[][] Y = { {  1,  1, 1 },
                {  2, 2, 2 },
                { 3,  3, 3 } };
    int[][] Z = { {  2,  2, 2 },
                {  2, 2, 2 } };
    int[][] E = { {  2,  4, 2 },
                {  2, 2, 2 } };

    //Part 4
    System.out.println(ArrayOps.sum(B));

    System.out.println( Arrays.toString(ArrayOps.sumRows(A)));

    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
    
    System.out.println(ArrayOps.sum(A));

    //Part 5
    System.out.println( Arrays.toString(ArrayOps.sumCols(A)));

    System.out.println(ArrayOps.isRowMagic(X));
    System.out.println(ArrayOps.isRowMagic(Y));
    System.out.println(ArrayOps.isRowMagic(Z));

    System.out.println(ArrayOps.isColMagic(X));
    System.out.println(ArrayOps.isColMagic(Y));
    System.out.println(ArrayOps.isColMagic(Z));

    System.out.println(ArrayOps.isLocationMagic(E, 0, 1));
    System.out.println(ArrayOps.isLocationMagic(E, 1, 1));

  }
}
