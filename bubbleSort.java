public class bubbleSort {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void  sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] < arr[j+1])
                    swap(arr, j, j+1);
            }
        }
    }
    public static void display(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,5,4,1,3,89,9,67,4,2,0};
        sort(arr);
        display(arr);
    }
}
