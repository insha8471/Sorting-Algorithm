public class bubbleSort {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void  sort(int[] arr){
        
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int didSwap = 0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    didSwap = 1;
                }       
            }
            if(didSwap == 0){
                break;
            }
        }
    }
    public static void display(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,46,50,3,2,4,5,6};
        sort(arr);
        display(arr);
    }
}
