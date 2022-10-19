package array

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val s = scanner.next()
    val n = scanner.nextInt()
    val indices = IntArray(n)


    for (i in 0 until n) {
        indices[i] = scanner.nextInt()
    }

    var res = ""
    val ch = s.toCharArray()

    for (i in indices.indices) {
        for (j in indices.indices) {
            if (indices[j] == i) {
                res += ch[j]
                break
            }
        }
    }

    println(res)
}