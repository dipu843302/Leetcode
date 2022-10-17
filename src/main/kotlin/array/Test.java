package array;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String[] arr =new String[n];

        for (int i=0;i<n;i++){
            arr[i]=scanner.nextLine();
        }
        int a=0;
        for (int i=0;i<arr.length;i++){
            String x=arr[i];
            String[] temp =x.split(" ");
            a=Math.max(a,temp.length);
        }
        System.out.println(a);
    }
}
