package org.example.testing;

public class SelectionSort {

    public static void callSelectoinSort(int [] arr){
        for( int i=0;i<arr.length;i++){
            int minPos=i;
            for( int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            swappingArr(arr,i,minPos);
        }

        System.out.println("printing in Sorted Order");
        printArr(arr);
    }

    public static void callReverseSelectionSort(int [] arr){
        for( int i=0;i<arr.length;i++){
            int minPos=i;
            for( int j=i+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos=j;
                }
            }
            swappingArr(arr,i,minPos);
        }

        System.out.println("printing in Reversed Sorted Order");
        printArr(arr);
    }
    public static int[] swappingArr(int[] arr, int a, int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

        return  arr;
    }
    public static void printArr(int [] arr){
        for( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int [] arr= {1,5,6,4,3,2};
        callSelectoinSort(arr);

        callReverseSelectionSort(arr);

    }
}
