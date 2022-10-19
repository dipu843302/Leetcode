package array

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n=scanner.nextInt()
    val nums=IntArray(n)

    for (i in nums.indices){
        nums[i]=scanner.nextInt()
    }
    val index=IntArray(nums.size)
    for (i in nums.indices){
        index[i]=scanner.nextInt()
    }
    val target=IntArray(nums.size)

    for (i in nums.indices){
        target[i]=nums[index[i]]
    }

}