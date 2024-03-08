public class quickSort {
    //swap
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //partition
    static int partition(int[] arr, int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high-1) i++;
            while (arr[i] >= pivot && j >= low+1) j--;

            if(i < j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }

    //quick sort
    static void sort(int[] arr, int low, int high){
        if(low >= high) return;

        int pivotIdx = partition(arr,low,high);
        
        sort(arr, 0, pivotIdx-1);
        sort(arr, pivotIdx+1, high);
    }
    
    //display
    static void display(int arr[]){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int n = arr.length;
        sort(arr,0,n-1);
        display(arr);
    }
}
