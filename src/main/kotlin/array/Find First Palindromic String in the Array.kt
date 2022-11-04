package array

fun main() {

}

fun firstPalindrome(words: Array<String>): String {
    var ans = ""
    for (i in words.indices) {
        if (checkPalindrome(words[i])) {
            ans=words[i]
            break
        }
    }
    return ans
}

fun checkPalindrome(s: String): Boolean {
    return s == s.reversed()
}