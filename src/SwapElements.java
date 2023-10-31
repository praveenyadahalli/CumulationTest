public class SwapElements {
    public static void main(String[] args) {
        int arr[]={13,19,23,34,57,8};
        int arr2[]={12,28,33,4,9,44,66};
        for(int i:swap(arr)){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:swap(arr2)){
            System.out.print(i+" ");
        }
    }


    public static int[] swap(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i+=2){
            int k=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=k;
        }
        return arr;
    }
}