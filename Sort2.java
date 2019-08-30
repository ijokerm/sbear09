import java.util.Stack;

public class Sort2 {
    public static void quickSortf(int[]array){
        Stack<Integer>stack=new Stack<>();
        stack.push(array.length);
        stack.push(0);

        while(!stack.empty()){
            int left=stack.pop();
            int right=stack.pop();
            if(left>=right){
                continue;
            }
            int privotindex=partition(array,left,right);
        }
    }
    public static int partition(int[]array,int left,int right){
        int privot=array[right];
        int less=left;
        for(int i=left;i<right;i++){
            if(array[i]<privot){
                swap(array,less,i);
                less++;
            }
            swap(array,less,right);
        }
        return less;

    }
    public static void swap(int[]arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    //归并排序
    public static void mergeSort(int[] array){
         mergeSortInternal(array,0,array.length);
    }
    public static void mergeSortInternal(int[] arr,int low,int high){
        if(low+1>=high){return;}
        int mid=(low+high)/2;
        mergeSortInternal(arr,low,mid);
        mergeSortInternal(arr,mid,high);
        merge(arr,low,mid,high);
    }
    //合并有序数组
    public static void merge(int[] arr,int low,int mid,int high){
        int length=high-low;
        int[]result=new int[length];

        int i=low;
        int j=mid;
        int k=0;
        while(i<mid && j<high){
            if(arr[i]<arr[mid]){
             result[k++]=arr[i++];
            }else{
                result[k++]=arr[j++];
            }

            if(i<mid){
                result[k++]=arr[i++];
            }
            if(j<high){
                result[k++]=arr[j++];
            }
            for(int n=0;n<length;n++){
                result[low+n]=arr[n];
            }
        }



    }

    public static void mergeSortf(int[] array){
        for(int i=0;i<array.length-1;i=2*i){
            for(int j=0;j<array.length-1;j=j+2*i){
             int low=j;
             int mid=low+i;
             int high=mid+i;
             if(mid>=array.length){
                 continue;
               }
               if(high>=array.length){
                   high=array.length;
               }
            merge(array,low,mid,high);
            }
        }
    }

    public static void main(String[] args) {

    }
}













