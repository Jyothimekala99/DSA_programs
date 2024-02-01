public class Matrix {
    //To print matrix
    public static void printMatrix(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]+" ");
            }
            //System.out.println();
        }
        System.out.print(" ");
    }

    //Rotation of the matrix in anti clockwise
    public static void RotationOfMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
           for (int j = i + 1; j < a.length; j++) {
               int temp = a[i][j];
               a[i][j] = a[j][i];
               a[j][i] = temp;
           }
       }
       for (int i = 0; i < a.length; i++) {
           int start = 0;
           int end = a.length - 1;
           while (start < end) {
               int temp = a[start][i];
               a[start][i] = a[end][i];
               a[end][i] = temp;
               start++;
               end--;
           }
       }
       for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < a[i].length; j++) {
               System.out.print(a[i][j] + " ");
           }
           System.out.println();
    }
}

//Diagonal Matrix
public static int diagonalSumOfMatrix(int[][] a){
    int mainDiagonalSum = 0;
     int antiDiagonalSum = 0;
     int middle=0;
    for (int i = 0; i < a.length; i++) {
         mainDiagonalSum += a[i][i];
         antiDiagonalSum += a[i][a.length - 1 - i];
         if (a.length % 2 != 0 && i == a.length / 2) {
            middle = a[i][i];
        }
   }
   int sum = mainDiagonalSum + antiDiagonalSum - middle;
   return sum;
}

//Spiral Matrix
public static void spiralMatrix(int[][] a){
    int top = 0;
    int left =0;
    int right = a[0].length-1;
    int bottom = a.length-1;

    while(left<=right && top<=bottom){
        for(int i = left;i<=right;i++){
            System.out.print(a[top][i] + " ");
        }
        top++;
        for(int i=top;i<=bottom;i++){
            System.out.print(a[i][right]+" ");
        }
        right--;
        for(int i = right;i>=left;i--){
            System.out.print(a[bottom][i]+ " ");
        }
        bottom--;
        for(int i = bottom;i>=top;i--){
            System.out.print(a[i][left]+ " ");
        }
        left++;
}
}
public static void main(String[] args) {
    int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
    printMatrix(a);
    RotationOfMatrix(a);
    diagonalSumOfMatrix(a);
    spiralMatrix(a);
}
}
