class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {

        var first = -1
        var last = -1

        // Find first position
        var low = 0
        var high = nums.size - 1

        while (low <= high) {
            val mid = low + (high - low) / 2

            if (nums[mid] == target) {
                first = mid
                high = mid - 1       // left side search
            } 
            else if (nums[mid] < target) {
                low = mid + 1
            } 
            else {
                high = mid - 1
            }
        }

        // Find last position
        low = 0
        high = nums.size - 1

        while (low <= high) {
            val mid = low + (high - low) / 2

            if (nums[mid] == target) {
                last = mid
                low = mid + 1        // right side search
            } 
            else if (nums[mid] < target) {
                low = mid + 1
            } 
            else {
                high = mid - 1
            }
        }

        return intArrayOf(first, last)
    }
}