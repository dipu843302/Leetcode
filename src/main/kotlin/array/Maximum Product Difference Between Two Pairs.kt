package array

import java.util.*

fun main() {

}
fun maxProductDifference(nums: IntArray): Int {

    Arrays.sort(nums)

    var d=nums[0]
    var c=nums[1]
    var b=nums[nums.size-2]
    var a=nums[nums.size-1]

    var diff=(a*b)-(c*d)
    return diff
}