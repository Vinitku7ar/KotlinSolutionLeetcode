class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var ans=-1
        var start=0
        var end=nums.size-1
       if(nums[end]<target) return end+1
        while(start<=end){
            var mid = start+(end-start)/2
            if(nums[mid]==target){
                return mid
            }
            else if(nums[mid]<target){
                   
                    start=mid+1
            }
            else{
                ans=mid
                end=mid-1
            }
        }
        return ans
    }
}