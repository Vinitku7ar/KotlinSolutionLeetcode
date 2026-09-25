class Solution {

    fun subsets(nums: IntArray): List<List<Int>> {

        val ans = mutableListOf<List<Int>>()
        val output = mutableListOf<Int>()

        subset(nums, 0, output, ans)

        return ans
    }

    fun subset(
        nums: IntArray,
        index: Int,
        output: MutableList<Int>,
        ans: MutableList<List<Int>>
    ) {

        // base case
        if (index == nums.size) {
            ans.add(ArrayList(output))
            return
        }

        // INCLUDE
        output.add(nums[index])

        subset(nums, index + 1, output, ans)

        // BACKTRACK
        output.removeAt(output.size - 1)

        // EXCLUDE
        subset(nums, index + 1, output, ans)
    }
}