package array

fun main() {
    println(truncateSentence("Hello how are you Contestant", 4))
}

fun truncateSentence(s: String, k: Int): String {

    val s = "Hello how are you Contestant"
    val k = 4
    var a = ""

    val arr = s.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    for (i in 0 until k) {
        a += arr[i] + " "
    }
        a.trim()
 return a

}