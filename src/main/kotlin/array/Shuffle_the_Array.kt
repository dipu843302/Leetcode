package array

import java.util.*
//https://leetcode.com/problems/shuffle-the-array/submissions/
fun main() {
    val scanner = Scanner(System.`in`)
    var n=scanner.nextInt()
    val nums=IntArray(2*n)

    for (i in nums.indices){
        nums[i]=scanner.nextInt()
    }

    val ans=IntArray(2*n)
    var a=0

    for (i in 0 until n){
        ans[a]=nums[i]
        ans[a+1]=nums[n+i]
        a+=2
    }
    for (i in ans.indices){
        print(ans[i])
        print(" ")
    }

}