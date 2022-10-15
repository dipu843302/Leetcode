package array

import java.util.*
//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/submissions/
fun main() {
    val scanner = Scanner(System.`in`)
    val n=scanner.nextInt()
    val nums=Array<String>(n){""}

    for (i in nums.indices){
        nums[i]=scanner.next()
    }
    var x=0

    for (i in nums.indices){
        if (nums[i] == "++X" || nums[i]==("X++")){
           x++
        }else{
            x--
        }
    }
    print(x)
}