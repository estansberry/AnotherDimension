public class ArrayOps{
  public static void main(String[] args) {
  }
  public static int sum(int[] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i ++){
      sum = sum + arr[i];
    }return(sum);
  }
  public static int largest(int[] arr){
    int large = -2147483648;
    for (int i = 0; i < arr.length; i ++){
      if (arr[i] > large){
        large = arr[i];
      }
    }return(large);
  }
}
