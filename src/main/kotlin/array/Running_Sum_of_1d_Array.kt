package array

import java.util.*

//https://leetcode.com/problems/running-sum-of-1d-array/
fun main() {

    val scanner = Scanner(System.`in`)
    val n=scanner.nextInt()
    val nums=IntArray(n)

    for (i in nums.indices){
        nums[i]=scanner.nextInt()
    }

    val ans=IntArray(nums.size)
    var a=0
    for (i in ans.indices){
        a+=nums[i]
        ans[i]=a
    }
     for (i in ans.indices){
         print(ans[i])
         print(" ")
     }




}