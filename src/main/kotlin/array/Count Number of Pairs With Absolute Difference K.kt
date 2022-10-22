package array

import java.util.*
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)
    val n=scanner.nextInt()
    val nums=IntArray(n)

    for (i in nums.indices){
        nums[i]=scanner.nextInt()
    }
    val k=scanner.nextInt()
    var count=0
    for (i in nums.indices){
        for (j in i until nums.size){
            var diff= Math.abs(nums[i]-nums[j])
            if (diff==k){
                count++
            }
        }
    }
    println(count)
}