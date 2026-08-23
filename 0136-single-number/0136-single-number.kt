class Solution {
    fun singleNumber(nums: IntArray): Int {
        val freq = HashMap<Int,Int>()

         for(i in nums.indices){
            freq[nums[i]] = (freq[nums[i]] ?: 0)+1
         }

         for(x in freq){
            if(x.value==1) return x.key
         }
         return -1
    }
}