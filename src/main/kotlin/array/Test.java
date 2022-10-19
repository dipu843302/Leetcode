package array;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        int n=scanner.nextInt();
        int[] indices =new int[n];


        for (int i=0;i<n;i++){
            indices[i]=scanner.nextInt();
        }

        String res="";
        char[] ch = s.toCharArray();

        for (int i=0;i<indices.length;i++){
            for ( int j=0;j<indices.length;j++){
                if (indices[j]==i){
                    res+=ch[j];
                    break;
                }
            }
        }

        System.out.println(res);

    }
}
