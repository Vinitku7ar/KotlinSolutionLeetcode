class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        val set = nums.toHashSet()

        var ans = 0

        for (num in set) {

            // sequence ka starting point
            if (!set.contains(num - 1)) {

                var current = num
                var length = 1

                // consecutive numbers count karo
                while (set.contains(current + 1)) {
                    current++
                    length++
                }

                ans = maxOf(ans, length)
            }
        }

        return ans
    }
}