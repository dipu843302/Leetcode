package array

import java.util.*

// nums = [3,1,2,2,2,1,3], k = 2
fun main() {
    val scanner = Scanner(System.`in`)
    val k=scanner.nextInt()
    val n=scanner.nextInt()
    val nums=IntArray(n)

    for (i in nums.indices){
        nums[i]=scanner.nextInt()
    }

   println( countPairs(nums,k))


}
fun countPairs(nums: IntArray, k: Int): Int {

    var count=0;
    for( i in nums.indices){
        for(j in i+1 until nums.size){
            if(nums[i]==nums[j]){
                var multi=i*j
                if(multi%k==0){
                    count++
                }
            }
        }
    }
    return count
}