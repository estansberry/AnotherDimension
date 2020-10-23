public class Tester{
  public static void main(String[] args) {
    int[] a = {5, 4, 1};
    int[] b = {1, 0, 0, 0};
    int[] c = {};
    int[] d = {-11, - 45, -13, -3};
    int[] e = {1, 2, 150, -40};
    int[] f = {0, 0};
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
  }
}
