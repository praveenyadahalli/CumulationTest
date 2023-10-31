public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={6,7,8,9,10};
        for(int i:merge(arr1,arr2)){
            System.out.print(i+" ");
        }

    }
    public static int[] merge(int[] arr1,int[] arr2){
        int ans[]=new int[arr1.length+arr2.length];
        int l1=arr1[arr1.length-1];
        int l2=arr2[arr2.length-1];
        int n=arr1.length;
        boolean bool=false;
        if(l1<l2){
            bool=true;
        }else{
            bool=false;
        }
        for(int i=0;i<arr1.length;i++){
            if(bool){
                ans[i]=arr1[i];
                ans[n+i]=arr2[i];
            }else{
                ans[i]=arr2[i];
                ans[n+i]=arr1[i];
            }
        }
        return ans;
    }

}
