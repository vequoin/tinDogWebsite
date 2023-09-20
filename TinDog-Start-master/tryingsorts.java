public class tryingsorts{

    public merge(){

    }

    public static void mergeSort(int arr[], int begin, int end){
        int mid = (begin + end)/2;
        while(begin < end){
            mergeSort(arr,begin,mid);
            mergeSort(arr,mid+1,end);
            merge()
        }
    }
    public static void main(String[] args) {

        int [] arr = {23,5,12,6,1,67,3,10,13,64};
        System.out.println("The unsorted array is:");
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
        mergeSort(arr,0,arr.length);
        
    }
}