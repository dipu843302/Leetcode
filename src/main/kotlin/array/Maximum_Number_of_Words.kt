package array

import java.util.*
//https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/submissions/
fun main() {
    val scanner = Scanner(System.`in`)
    val n=scanner.nextInt()
    val sentences=Array<String>(n){""}

    for (i in sentences.indices){
        sentences[i]=scanner.next()
    }

    var a = 0
    for (i in sentences.indices) {
        val x: String = sentences.get(i)
        val temp = x.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        a = Math.max(a, temp.size)
    }
    println(a)

}