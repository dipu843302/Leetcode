package array

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n=scanner.nextInt()
    val nums=IntArray(n)

    for (i in nums.indices){
        nums[i]=scanner.nextInt()
    }

    var add=0

    for (i in nums.indices){
        var count=0
        for (j in i until nums.size){
            count+=nums[j]
            if ((i+j)%2==0){
                add+=count
            }
        }

    }
    println(add)
}