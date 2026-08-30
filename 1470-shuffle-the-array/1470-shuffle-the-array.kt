class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {

        val ans = IntArray(nums.size)

        var index = 0
        var indey = 1

        for (i in 0 until n) {

            ans[index] = nums[i]
            ans[indey] = nums[i + n]

            index += 2
            indey += 2
        }

        return ans
    }
}