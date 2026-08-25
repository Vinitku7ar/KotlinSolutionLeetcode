class Solution {

    fun check(piles: IntArray, k: Int, h: Int): Boolean {
        var hour : Long= 0

        for (pile in piles) {
            hour += (pile + k - 1) / k
        }

        return hour <= h
    }

    fun minEatingSpeed(piles: IntArray, h: Int): Int {

        var low = 1
        var high = piles.maxOrNull()!!
        var ans = high

        while (low <= high) {

            val mid = low + (high - low) / 2

            if (check(piles, mid, h)) {
                ans = mid
                high = mid - 1
            } else {
                low = mid + 1
            }
        }

        return ans
    }
}