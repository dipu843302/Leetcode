package array;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];

        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int a=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    a++;
                }
            }
        }
        System.out.println(a);
    }
}
