public class Arrays{

    public static void ReverseOfarray(){
        int a[]={1,2,3,4,5,6};
        int start=0;
        int end=a.length-1;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

   //Right rotation
   public static void rightRotation(int a[],int k) {
    int n = a.length;
    reverseee(a, 0, n - k - 1);
    reverseee(a, n - k, n - 1);
    reverseee(a, 0, n - 1);
    System.out.print("from right to left: ");
    for (int i = 0; i < n; i++) {
        System.out.print(a[i] + " ");
    }
    System.out.println();
}
   
 //Left Rotation
 public static void leftRotation(int a[], int k) {
    int n = a.length;
    reverseee(a, 0, k - 1);
    reverseee(a, k, n - 1);
    reverseee(a, 0, n - 1);
    System.out.print("from left to right: ");
    for (int i = 0; i < n; i++) {
        System.out.print(a[i] + " ");
    }
    System.out.println();
}  
private static void reverseee(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
//Maximum sub array
public static void findMaxSubarray(int[] arr) {
    int n = arr.length;
    int maxEndingHere = arr[0];
    int maxSoFar = arr[0];
    int start = 0;
    int end = 0;
    int tempStart = 0;

    for (int i = 1; i < n; i++) {
        if (arr[i] > maxEndingHere + arr[i]) {
            maxEndingHere = arr[i];
            tempStart = i;
        } else {
            maxEndingHere = maxEndingHere + arr[i];
        }
        if (maxEndingHere > maxSoFar) {
            maxSoFar = maxEndingHere;
            start = tempStart;
            end = i;
        }
    }
    System.out.println("Maximum Subarray Sum: " + maxSoFar);
    System.out.println("Start Index: " + start);
    System.out.println("End Index: " + end);
}

//maximum and minimum
public static void findMaxMin(int[] arr) {
    if (arr == null || arr.length == 0) {
        System.out.println("Array is empty");
        return;
    }
    int n = arr.length;
    int max = arr[0];
    int min = arr[0];

    for (int i = 1; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        } else if (arr[i] < min) {
            min = arr[i];
        }
    }
    System.out.println("Maximum value: " + max);
    System.out.println("Minimum value: " + min);
   }
   public static void main(String args[]){
    int[] a={-2,-3,4,-1,-2,1,5,-3};
    int[] nums = {2, 0, 2, 1, 1, 0};
    int[] array = {5, 2, 9, 1, 5, 6};
    ReverseOfarray();
    findMaxMin(array);
    int k = 2;
    rightRotation(array, k);
    leftRotation(array,k);
    //reverseee(array);
    findMaxSubarray(array);
}
}


