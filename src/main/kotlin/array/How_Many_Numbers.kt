package array

import java.util.*

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/
fun main() {
    val scanner = Scanner(System.`in`)
    val n=scanner.nextInt()
    val nums=IntArray(n)

    for (i in nums.indices){
        nums[i]=scanner.nextInt()
    }

   val ans=IntArray(nums.size)
    for(i in nums.indices){
        var count=0
        for (j in nums.indices){
            if (nums[i]>nums[j]){
                count++
            }
        }
        ans[i]=count
    }
}