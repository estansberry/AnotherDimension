public class ArrayOps{
  public static void main(String[] args) {
  }
  public static String arrToString(int[] arr){
    String newstr = "{";
    if (arr.length == 0){
      return("{}");
    }
    for (int i = 0; i < arr.length - 1; i ++){
      newstr = newstr + arr[i];
      newstr = newstr + ", ";
    }newstr = newstr + arr[arr.length - 1] + "}";
      return(newstr);
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
  public static int[] sumRows(int[][] matrix){
    int[] newarr;
    newarr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i ++){
      newarr[i] = sum(matrix[i]);
    }System.out.println(arrToString(newarr));
    return(newarr);
  }
  public static int[] largestInRows(int[][] matrix){
    int[] newarr;
    newarr = new int[matrix.length];
    for (int i = 0; i < matrix.length; i ++){
      newarr[i] = largest(matrix[i]);
    }System.out.println(arrToString(newarr));
    return(newarr);
  }

  public static int[] sumCols(int[][] matrix){
    int[] newarr;
    newarr = new int[matrix[0].length];
    for (int i = 0; i < matrix[0].length; i ++){
      int sum = 0;
      for (int j = 0; j < matrix.length; j ++){
        sum = sum + matrix[j][i];
      }newarr[i] = sum;
    }System.out.println(arrToString(newarr));
    return(newarr);
  }

  public static boolean isRowMagic(int[][] matrix){
    Boolean sumequal = true;
    int[] newarr = sumRows(matrix);
    for (int i = 0; i < newarr.length - 1; i ++){
      sumequal = (newarr[i] == newarr[i + 1]);
    }return(sumequal);
  }

  public static boolean isColMagic(int[][] matrix){
    Boolean sumequal = true;
    int[] newarr = sumCols(matrix);
    for (int i = 0; i < newarr.length - 1; i ++){
      sumequal = (newarr[i] == newarr[i + 1]);
    }return(sumequal);
  }

}
