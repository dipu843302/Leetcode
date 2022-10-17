package array

import java.util.*
/*
not done
 */
fun main() {
    val scanner = Scanner(System.`in`)
    val n=scanner.nextInt()
    val nums=IntArray(n)
    val extraCandies=scanner.nextInt()

    for (i in nums.indices){
        nums[i]=scanner.nextInt()
    }
    var list=Array<Boolean>(nums.size){false}
    val stats = Arrays.stream(nums).summaryStatistics()
    var a=0
    for (i in nums.indices){
         a=nums[i]+extraCandies
        list[i] = a>=stats.max
    }
    list.asList()
    for ( i in list.indices){
        print(list[i])
        print(" ")

    }

}
