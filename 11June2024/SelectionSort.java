public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,5,2,7,3,9,4};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sorting(arr, n);
    }
    static void sorting(int arr[], int n){
        for(int i= 0; i<arr.length; i++){
            int min = i;
            for(int j = i+1; j<n-1; j++){
                if(arr[min]<arr[j]){
                    min = j;
                }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
