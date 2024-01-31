class Algorithms {
//Boyer-Moore Majority Voting Algorithm
public static int boyerMoore(int[] nums) {
    int votes = 1;
    int majorityElement = nums[0];
    for (int i = 1; i < nums.length; i++) {
        if (votes == 0) {
            majorityElement = nums[i];
            votes++;
        } else if (majorityElement != nums[i]) {
            votes--;
        } else {
            votes++;
        }
    }
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == majorityElement) {
            count++;
        }
    }
    if (count > nums.length / 2) {
        return majorityElement;
    }
    System.out.println(majorityElement);
    return 0;
    
}
    

//Dutch national flag algorithm
public static void dutchNational() {
    int[] a = { 2, 0, 2, 1, 1, 0 };
    int n = a.length;
    int low = 0;
    int mid = 0;
    int high = n - 1;
    while (mid <= high) {
        if (a[mid] == 0) {
            int temp = a[low];
            a[low] = a[mid];
            a[mid] = temp;
            low++;
            mid++;
        } else if (a[mid] == 1) {
            mid++;
        } else {
            int temp = a[mid];
            a[mid] = a[high];
            a[high] = temp;
            high--;
        }
    }
    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
    }
}
//Two sum
public static void twoSum() {
    int[] a = { 2, 7, 11, 19 };
    int target = 9;
    int n = a.length;
    int[] b = new int[2];
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (a[i] + a[j] == target) {
                b[0] = i;
                b[1] = j;
                break;
            }
        }
    }
    for (int i = 0; i < b.length; i++) {
        System.out.print(b[i] + " ");
    }
}

//Bubble Sort
public static void bubbleSort(int[] arr)
{   
    int n=arr.length;
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1]) {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        } 
    }
    System.out.println();
    for(int i = 0 ;i<n;i++) {
        System.out.print(arr[i]);
}
}

//Selection Sort
public static void selectionSort(int[] arr){
    for(int i=0;i<arr.length;i++){
        int minPos=i;
        for(int j=i+1;j<arr.length;j++) {
            if(arr[j]<arr[minPos]){
                minPos=j;
            }
        }
        int temp=arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }
    System.out.println();
    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]);
}
}

//Insertion Sort
public static void insertionSort(int[] arr)
{
    for(int i=0;i<arr.length-1;i++) {
        int j=i+1;
        while(j>0 && arr[j]<arr[j-1]) {
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }

    }
    System.out.println();
    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]);
}
}

public static void main(String[] args) {
    int[] a = { 4, 6, 2, 3, 1 };
    int[] arr = {2,3,4,5,6,7,2};
    boyerMoore(a);
    System.out.println();
    dutchNational();
    System.out.println();
    twoSum();
    System.out.println();
    bubbleSort(arr);
    selectionSort(arr);
    insertionSort(arr); 
   }
}