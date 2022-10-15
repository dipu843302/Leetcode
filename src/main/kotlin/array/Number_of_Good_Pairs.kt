package array

import java.util.*

//https://leetcode.com/problems/number-of-good-pairs/
fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val nums = IntArray(n)

    for (i in nums.indices) {
        nums[i] = scanner.nextInt()
    }
    var a = 0
    for (i in nums.indices) {
        for (j in i+1 until  nums.size) {
            if (nums[i] == nums[j]) {
                a++
            }
        }
    }

    print(a)
}