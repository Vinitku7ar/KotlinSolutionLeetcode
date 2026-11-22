
class Solution {
    fun largestDivisibleSubset(nums: IntArray): List<Int> {

        nums.sort()

        val n = nums.size
        val dp = IntArray(n) { 1 }
        val parent = IntArray(n) { it }

        var maxIndex = 0

        for (i in 0 until n) {

            for (j in 0 until i) {

                if (nums[i] % nums[j] == 0 &&
                    dp[j] + 1 > dp[i]) {

                    dp[i] = dp[j] + 1
                    parent[i] = j
                }
            }

            if (dp[i] > dp[maxIndex]) {
                maxIndex = i
            }
        }

        val ans = mutableListOf<Int>()

        var index = maxIndex

        while (parent[index] != index) {
            ans.add(nums[index])
            index = parent[index]
        }

        ans.add(nums[index])

        return ans.reversed()
    }
}
