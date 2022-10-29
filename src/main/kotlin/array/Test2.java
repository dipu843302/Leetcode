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


    }



