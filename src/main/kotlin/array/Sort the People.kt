package array

import java.util.*

fun main() {
   var names: Array<String> = arrayOf("Marry","John","Emma")
   var heights: IntArray =IntArray(names.size){ i ->i }
    println(sortPeople(names,heights))
}
fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
    val m = HashMap<Int, String>()
    for (i in names.indices) {
        m[heights[i]] = names[i]
    }
    val sortKeys = ArrayList(m.keys)
    Collections.sort(sortKeys, Collections.reverseOrder())
    val arr = ArrayList<String>()
    for (x in sortKeys) {
        arr.add(m[x].toString())
    }

    return arr.toTypedArray()
}