class Solution {
    fun canJump(nums: IntArray): Boolean {
        var maxReach = 0
        
        for (i in nums.indices) {
            // If the current index is beyond the farthest reachable point, we are stuck
            if (i > maxReach) return false
            
            // Update the farthest index we can reach from here
            maxReach = maxOf(maxReach, i + nums[i])
            
            // Early exit if we can already reach or pass the last index
            if (maxReach >= nums.lastIndex) return true
        }
        
        return true
    }
}
