package array;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(diagonalSum(arr));


    }
    public static int diagonalSum(int[][] mat) {
        int count=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if (i==j || i+j==mat.length-1){
                    count+=mat[i][j];
                }

            }
        }
        return count;
    }
}




