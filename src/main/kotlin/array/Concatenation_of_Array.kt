package array

import java.util.*

//https://leetcode.com/problems/concatenation-of-array/
fun main() {

    val scanner = Scanner(System.`in`)
    val n=scanner.nextInt()
    val nums=IntArray(n)

    for (i in nums.indices){
        nums[i]=scanner.nextInt()
    }

    val ans=IntArray(2*nums.size)
     var a=0
    for (i in nums.indices){
        ans[i]=nums[i]
        a++
    }
    for (i in nums.indices){
        ans[a]=nums[i]
        a++
    }
    for (i in ans.indices){
        print(ans[i])
        print(" ")
    }
}












