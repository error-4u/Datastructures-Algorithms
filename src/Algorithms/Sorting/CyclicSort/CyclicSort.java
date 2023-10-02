package Algorithms.Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {59,42,43,24,18};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        int i =  0;
        while( i < arr.length){
            int CorrectIndex = arr[i] - 1;
            if( CorrectIndex >= 0 && CorrectIndex < arr.length  && arr[i] != arr[CorrectIndex]){
                swap(arr, i, CorrectIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] =  arr[second];
        arr[second] = temp;
    }
}
