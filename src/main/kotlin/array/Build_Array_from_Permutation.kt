package array

import java.util.Scanner

class Build_Array_from_Permutation {

}

fun main(){
    val scanner =Scanner(System.`in`)
    val n=scanner.nextInt()
    val nums=Array<Int>(n){0}

    for (i in nums.indices){
        nums[i]=scanner.nextInt()
    }
    val ans=IntArray(nums.size)

    for (i in nums.indices){
        ans[i]=nums[nums[i]]
    }

    for (i in 0 until  n){
        print("${ans[i]} ")
    }
// 0 2 1 5 3 4
}