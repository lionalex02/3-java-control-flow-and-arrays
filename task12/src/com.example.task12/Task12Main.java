package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
            if (arr == null || arr.length == 0 )
                return;
            int ret;
            for (int i=0; i < 2; i++ ) {
                int numI = swap(arr, i);
                ret = arr[numI];
                arr[numI] = arr[i];
                arr[i] = ret;
            }
    }
     static int swap(int[] arr, int k){
         int boofer = arr[k];
         int numJ=0;
         for ( int j = k; j < arr.length; j++){

             if (boofer >= arr[j]){
                 boofer = arr[j];
                 numJ = j;
             }
         }
         return numJ;
     }
}