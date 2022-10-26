package array
//https://leetcode.com/problems/flipping-an-image/submissions/
fun main() {

}

fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray>? {
    reverseArray(image)
    for (i in image.indices) {
        for (j in image[i].indices) {
            if (image[i][j] == 0) {
                image[i][j] = 1
            } else {
                image[i][j] = 0
            }
        }
    }
    return image
}

fun reverseArray(arr: Array<IntArray>): Array<IntArray>? {
    val M = arr.size
    val N = arr[0].size

    for (i in 0 until M) {

        var start = 0
        var end = N - 1

        while (start < end) {

            val temp = arr[i][start]
            arr[i][start] = arr[i][end]
            arr[i][end] = temp

            start++
            end--
        }
    }
    return arr
}