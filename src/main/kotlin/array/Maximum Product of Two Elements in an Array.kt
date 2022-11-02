package array

fun main() {

}
fun maxProduct(nums: IntArray): Int {

    var diff=0
    var maxValue=0
    for(i in nums.indices){
        for (j in i+1 until nums.size){
            diff=(nums[i]-1)*(nums[j]-1)
            maxValue=Math.max(diff,maxValue)
        }
    }
    return maxValue
}