package array

fun main() {

    val strings = arrayOf("a", "cb")
    val strings2 = arrayOf("ab", "c")
    println(arrayStringsAreEqual(strings,strings2))

}
fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
    var w1=""
    var w2=""
    for(i in word1.indices){
        w1+=word1[i]
    }
    for(i in word2.indices){
        w2+=word2[i]
    }
    return w1==w2
}