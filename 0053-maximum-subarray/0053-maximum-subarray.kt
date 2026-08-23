class Solution {
    fun maxSubArray(nums: IntArray): Int {
        val n=nums.size
        val ked =IntArray(n)
        
        ked[0]=nums[0]
        for(i in 1..n-1){
            ked[i]=maxOf(nums[i], nums[i] + ked[i - 1])
        }

        var max =ked[0]
        for(x in ked){
            if(max<x){
                max=x
            }
        }
        return max
    }
}