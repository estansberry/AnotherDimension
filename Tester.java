public class Tester{
  public static void main(String[] args) {
    int[] a = {5, 4, 1};
    int[] b = {1, 0, 0, 0};
    int[] c = {};
    int[] d = {-11, - 45, -13, -3};
    int[] e = {1, 2, 150, -40};
    int[] f = {0, 0};
    int[][] g = {{5, 4, 3}, {0}, {3, 2, 2, 2, 1}, {}, {7, 9}};
    int[][] h = {{0}};
    int[][] i = {{5, 4, 3}, {0}, {3, 2, 2, 2, 1}, {-3}, {7, 9}};
    int[][] j = {{0}};
    int[][] k = { {  1,  0, 12, -1 },{  7, -2,  2,  1 },{ -5, -2,  2, -9 }};
    int[][] l = {{5, 6}, {1, 2}, {1, 0}, {10, 9}};
    int[][] m = {{},{},{}};
    System.out.print("Should be 10: ");
    System.out.println(ArrayOps.sum(a));
    System.out.print("Should be 1: ");
    System.out.println(ArrayOps.sum(b));
    System.out.print("Should be 0: ");
    System.out.println(ArrayOps.sum(c));
    System.out.print("Should be -3: ");
    System.out.println(ArrayOps.largest(d));
    System.out.print("Should be 150: ");
    System.out.println(ArrayOps.largest(e));
    System.out.print("Should be 0: ");
    System.out.println(ArrayOps.largest(f));
    System.out.print("Should be {12, 0, 10, 0, 16}: ");
    ArrayOps.sumRows(g);
    System.out.print("Should be {0}: ");
    ArrayOps.sumRows(h);
    System.out.print("Should be {5, 0, 3, -3, 9}: ");
    ArrayOps.largestInRows(i);
    System.out.print("Should be {0}: ");
    ArrayOps.largestInRows(j);
    System.out.print("Should be {3, -4, 16, -9}: ");
    ArrayOps.sumCols(k);
    System.out.print("Should be {17, 17}: ");
    ArrayOps.sumCols(l);
    System.out.print("Should be true: ");
    System.out.println(ArrayOps.isRowMagic(l));
    System.out.print("Should be false: ");
    System.out.println(ArrayOps.isRowMagic(k));
    System.out.print("Should be true: ");
    System.out.println(ArrayOps.isRowMagic(m));
  }
}
