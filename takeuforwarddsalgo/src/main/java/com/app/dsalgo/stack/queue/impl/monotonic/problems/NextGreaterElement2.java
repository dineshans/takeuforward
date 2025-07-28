package com.app.dsalgo.stack.queue.impl.monotonic.problems;


import java.util.Arrays;


/*
*  Find the Next greater element, if not find then check in circular array
* */
public class NextGreaterElement2 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        //int[] result = findNextGreaterElement(arr);
        int[] result = findNextGreaterElement(arr);
        System.out.println("Original Arrays is : ");
        Arrays.stream(arr).forEach(e -> System.out.print(" " + e));
        System.out.println();
        System.out.println("Nge Arrays is : ");
        Arrays.stream(result).forEach(e -> System.out.print(" " + e));
    }

    /*
    *  Brute force approach
    * */
    public static int[] findNextGreaterElement(int[] arr) {
        int[] nge = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    nge[i] = arr[j];
                    break;
                } else {
                    for (int k = 0; k <= i-1; k++) {
                        if (arr[k] > arr[i]) {
                            nge[i] = arr[k];
                            break;
                        }
                    }
                }
            }
        }
        return nge;
    }
}
