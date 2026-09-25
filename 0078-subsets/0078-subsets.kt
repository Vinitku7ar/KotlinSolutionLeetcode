class Solution {

    fun subsets(nums: IntArray): List<List<Int>> {

        val ans = mutableListOf<List<Int>>()
        val output = mutableListOf<Int>()

        subset(nums, 0, output, ans)

        return ans
    }

    fun subset(
        nums: IntArray,
        start: Int,
        output: MutableList<Int>,
        ans: MutableList<List<Int>>
    ) {

        // Har point par current output ek valid subset hai
        ans.add(ArrayList(output))

        for (i in start until nums.size) {

            // INCLUDE
            output.add(nums[i])

            // RECURSION
            subset(nums, i + 1, output, ans)

            // BACKTRACK
            output.removeAt(output.size - 1)
        }
    }
}