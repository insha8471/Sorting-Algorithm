class selectionSort{
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort(int[] arr){
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            int maxIdx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] > arr[maxIdx]){
                    maxIdx = j;
                }
            }
            swap(arr,i,maxIdx);
        }
    }
    public static void display(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,5,4,1,3,9,5,4,3,2,67};
        sort(arr);
        display(arr);
    }
}