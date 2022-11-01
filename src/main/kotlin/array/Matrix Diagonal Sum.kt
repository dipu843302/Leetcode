package array

fun main() {
println(checkPrimary(1))
println(checkPrimary(17))
println(checkPrimary(5))
}

fun diagonalSum(mat: Array<IntArray>): Int {
    var count = 0
    for (i in mat.indices) {
        for (j in mat[i].indices) {
            if (i == j || i + j == mat.size - 1) {
                count += mat[i][j]
            }
        }
    }
    return count
}

fun checkPrimary(a:Int):Boolean{
    var count=0
    for (i in 1 until a){
        if (a%i==0){
            count++
        }
    }
    return count <= 1
}