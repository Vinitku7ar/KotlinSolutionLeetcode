
class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        val n = heights.size
        var maxArea = 0

        for (index in 0 until n) {
            var left = index
            var right = index
            val curr = heights[index]

            while (left > 0 && heights[left - 1] >= curr) {
                left--
            }

            while (right < n - 1 && heights[right + 1] >= curr) {
                right++
            }

            val maxWidth = right - left + 1
            val area = maxWidth * curr

            maxArea = maxOf(area, maxArea)
        }

        return maxArea
    }
}
