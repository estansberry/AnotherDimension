public class Tester{
  public static void main(String[] args) {
    int[] a = {5, 4, 1};
    int[] b = {1, 0, 0, 0};
    int[] c = {};
    System.out.print("Should be 10: ");
    System.out.println(ArrayOps.sum(a));
    System.out.print("Should be 1: ");
    System.out.println(ArrayOps.sum(b));
    System.out.print("Should be 0: ");
    System.out.println(ArrayOps.sum(c));
  }
}
