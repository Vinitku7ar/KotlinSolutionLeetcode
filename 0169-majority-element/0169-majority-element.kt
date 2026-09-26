class Solution {
    fun majorityElement(nums: IntArray): Int {

        val threshold = nums.size/2
        
        for(i in nums.indices){
             var freq=0
            for(j in nums.indices){
                if(nums[i]==nums[j]){
                    freq++ 
              }
              
            }
             if(freq>threshold){
                       return nums[i]
                }
        }
        return -1
    }
}