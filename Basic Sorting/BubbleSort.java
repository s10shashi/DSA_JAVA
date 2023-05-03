package org.example.testing;

public class BubbleSort {

    public static void callBubbleSort(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    callSwap(arr,j,j+1);
                }
            }
        }
        System.out.println("Printing in Ascending Order");
        printArr(arr);
    }
    public static void callReverseBubbleSort(int [] arr){
        for( int i=0;i<arr.length-1;i++){
            for( int j=0;j<arr.length-1-i;j++){
                // only difference is here in Descending Sort.
                if(arr[j]<arr[j+1]){
                   callSwap(arr,j,j+1);
                }
            }
        }
        System.out.println("Printing in Descending Order");
        printArr(arr);
    }

    public static void printArr(int [] arr){
        for( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[]  callSwap(int [] arr, int a, int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return arr;
    }
    public static void main(String[] args) {
        int [] arr= {5,3,4,2,1,6};
        callBubbleSort(arr);
        callReverseBubbleSort(arr);

    }
}
