
class Solution {

    fun helper(nums: IntArray, last: Int, i: Int, dp: Array<IntArray>): Int {

        if (i == nums.size) {
            return 0
        }

        if (dp[i][last + 1] != -1) {
            return dp[i][last + 1]
        }

        val notTake = helper(nums, last, i + 1, dp)

        var take = 0

        if (last == -1 || nums[last] < nums[i]) {
            take = 1 + helper(nums, i, i + 1, dp)
        }

        dp[i][last + 1] = maxOf(take, notTake)

        return dp[i][last + 1]
    }

    fun lengthOfLIS(nums: IntArray): Int {
        val n = nums.size
        val dp = Array(n) { IntArray(n + 1) { -1 } }

        return helper(nums, -1, 0, dp)
    }
}
