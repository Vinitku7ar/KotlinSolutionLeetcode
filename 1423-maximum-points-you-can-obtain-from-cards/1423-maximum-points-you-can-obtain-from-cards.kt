class Solution {
    fun maxScore(cardPoints: IntArray, k: Int): Int {
        val n = cardPoints.size
        var current = 0
        for(i in n - k until n) {
            current += cardPoints[i]
        }
        var pointer = n - k
        var res = current
        for (i in 0 until k) {
            current = current - cardPoints[pointer] + cardPoints[i]
            res = maxOf(res, current)
            pointer++
        }
        return res
    }
}