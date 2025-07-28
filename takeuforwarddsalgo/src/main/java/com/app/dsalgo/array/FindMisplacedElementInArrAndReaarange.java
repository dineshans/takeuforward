package com.app.dsalgo.array;

import java.util.Arrays;

public class FindMisplacedElementInArrAndReaarange {

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 5, 7, 8};
        int misplacedIndex = findMisplaced(arr);
        System.out.println("Misplaced element: " + arr[misplacedIndex] + " And misplaced index is : " + misplacedIndex);
        //int[] fixed = fixArray(arr, misplacedIndex);
        int[] fixed = fixArray(arr, misplacedIndex);
        System.out.println("Fixed array: " + Arrays.toString(fixed));
    }

    // Step 1: Find the misplaced element
    static int findMisplaced(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return i;
            }
        }
        return -1; // already sorted
    }

    // Step 2: Fix the array with just one extra array
    static int[] fixArray(int[] arr, int misplacedIndex) {
        int n = arr.length;
        int[] result = new int[n];
        boolean inserted = false;
        int resIndex = 0;
        int misplaced = arr[misplacedIndex];
        for (int i = 0; i < n; i++) {
            // Skip the misplaced element once
            if (i > 0 && arr[i] < arr[i - 1]) {
                continue;
            }
            // Insert misplaced at correct position
            if (!inserted && misplaced < arr[i]) {
                result[resIndex++] = misplaced;
                inserted = true;
            }
            result[resIndex++] = arr[i];
        }

        // If not inserted yet, add misplaced at end
        if (!inserted) {
            result[resIndex] = misplaced;
        }
        return result;
    }
    /*// Step 2: Create a new fixed array with misplaced number in the right position
    static int[] fixArray(int[] arr, int skipIndex) {
        int misplaced = arr[skipIndex];
        int[] temp = new int[arr.length - 1];
        //int skipIndex = -1;
        // Find index of misplaced and copy all other elements to temp
        *//*for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                skipIndex = i;
                break;
            }
        }*//*
        // Fill temp array excluding the misplaced element
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != skipIndex) {
                temp[idx++] = arr[i];
            }
        }
        // Insert misplaced into the correct position in new result array
        int[] result = new int[arr.length];
        boolean inserted = false;
        int i = 0, j = 0;
        while (i < result.length) {
            if (!inserted && (j == temp.length || misplaced < temp[j])) {
                result[i++] = misplaced;
                inserted = true;
            } else {
                result[i++] = temp[j++];
            }
        }
        return result;
    }*/
}
