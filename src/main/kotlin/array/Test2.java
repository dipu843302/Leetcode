package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Test2 {

    static HashMap<Integer, String> m = new HashMap<>();

    // Function to sort map by Key
    public static void sortMapByKey() {
        ArrayList<Integer> sortKeys
                = new ArrayList<Integer>(m.keySet());

        Collections.sort(sortKeys, Collections.reverseOrder());

        ArrayList<String> arr = new ArrayList<>();

        for (Integer x : sortKeys) {
            arr.add(m.get(x));
        }
        String[] arr2 = arr.toArray(new String[0]);
        for (String x : arr2)
            System.out.print(x + " ");

    }

    // Driver Code
    public static void main(String args[]) {
        // putting values in the Map
        m.put(7, "seven");
        m.put(5, "five");
        m.put(1, "one");
        m.put(3, "three");
        m.put(9, "nine");

        // Calling the function to sortMapByKey to
        // perform sorting based on keys
        sortMapByKey();

    }
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> m = new HashMap<>();
        for (int i=0;i< names.length;i++){
            m.put(heights[i],names[i]);
        }
        ArrayList<Integer> sortKeys
                = new ArrayList<Integer>(m.keySet());

        Collections.sort(sortKeys, Collections.reverseOrder());

        ArrayList<String> arr = new ArrayList<>();

        for (Integer x : sortKeys) {
            arr.add(m.get(x));
        }
        String[] arr2 = arr.toArray(new String[0]);
        return arr2;

    }
}
