package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0 )
            return;
        int boofer = arr[0];
        int numI=0;
        int ret;


        for (int i = 1; i < arr.length; i++){

            if (boofer >= arr[i]){
                boofer = arr[i];
                numI = i;
            }

        }
        ret = arr[numI];
        arr[numI] = arr[0];
        arr[0] = ret;


    }

}