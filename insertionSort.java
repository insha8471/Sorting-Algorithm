import java.util.Scanner;

public class insertionSort {
    public static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public static void insertionSortAlgo(int arr[], int n){
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j] < arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
    }
    public static void display(int[] arr){
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        insertionSortAlgo(arr,n);

        display(arr);
    }
}
