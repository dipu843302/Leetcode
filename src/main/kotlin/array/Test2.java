package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Test2 {

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String a = "";

        String arr[] = s.split(" ");
        for (int i = 0; i < k; i++) {
            a += arr[i] + " ";
        }
        System.out.println(a);

    }


    public int[][] flipAndInvertImage(int[][] image) {

        reverseArray(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }

    public int[][] reverseArray(int arr[][]) {

        int M = arr.length;
        int N = arr[0].length;
        // Traverse each row of arr[][]
        for (int i = 0; i < M; i++) {

            // Initialise start and end index
            int start = 0;
            int end = N - 1;

            // Till start < end, swap the element
            // at start and end index
            while (start < end) {

                // Swap the element
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                // Increment start and decrement
                // end for next pair of swapping
                start++;
                end--;
            }
        }
        return arr;
    }
}