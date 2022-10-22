package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        List<List<String>> items = new ArrayList<List<String>>();

        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        List<String> list3 = new ArrayList<String>();
        list.add("phone");
        list.add("blue");
        list.add("pixel");
        items.add(list);

        list2.add("computer");
        list2.add("silver");
        list2.add("lenovo");
        items.add(list2);

        list3.add("phone");
        list3.add("gold");
        list3.add("iphone");
        items.add(list3);


           // "computer", "silver", "lenovo"

        //    "phone", "gold", "iphone"

        String ruleKey = "color";
        String ruleValue = "phone";
        System.out.println(  Math.abs(-15));
      //  System.out.println(countMatches(items,ruleKey,ruleValue));

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < items.get(i).size(); j++) {
                if (ruleValue == items.get(i).get(j)) {
                    count++;
                }
            }
        }
        return count;

    }
}
