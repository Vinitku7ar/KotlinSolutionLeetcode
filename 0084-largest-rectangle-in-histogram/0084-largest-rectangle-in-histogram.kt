/* 
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
*/

class Solution {
    fun largestRectangleArea(heights: IntArray): Int {

        val n = heights.size
        val stack = ArrayDeque<Int>()
        var maxArea = 0

        for (i in 0..n) {

            val curr = if (i == n) 0 else heights[i]

            while (stack.isNotEmpty() &&
                heights[stack.last()] > curr) {

                val height = heights[stack.removeLast()]

                val left = if (stack.isEmpty()) -1
                           else stack.last()

                val width = i - left - 1
                val area = height * width

                maxArea = maxOf(maxArea, area)
            }

            if (i < n) {
                stack.addLast(i)
            }
        }

        return maxArea
    }
}
