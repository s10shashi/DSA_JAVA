package org.example.testing;

public class InsertionSort {
    public static void callInsertionSort(int [] arr){

        for( int i=1;i<arr.length;i++){
            int curr= arr[i];
            int prev=i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]= arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        System.out.println("printing Sorted Array");
    }
    public static void callReverse(int [] arr){
        for( int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev= i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        System.out.println("Printing the array in Reverse Order");
    }

    public static void printArr(int [] arr){
        for( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr= {1,5,6,4,3,2};
        callInsertionSort(arr);
        printArr(arr);
        callReverse(arr);
        printArr(arr);
    }
}
