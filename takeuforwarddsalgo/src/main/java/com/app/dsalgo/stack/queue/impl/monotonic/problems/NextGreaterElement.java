package com.app.dsalgo.stack.queue.impl.monotonic.problems;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = {6, 0, 8, 1, 3};
        //int[] result = findNextGreaterElement(arr);
        int[] result = findNgeUsingStack(arr);
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
                }
            }
        }
        return nge;
    }

    public static int[] findNgeUsingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return nge;
    }
}
