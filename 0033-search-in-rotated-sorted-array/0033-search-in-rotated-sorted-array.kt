class Solution {
    fun search(nums: IntArray, target: Int): Int {
        val n = nums.size
        var start=0
        var end=n-1

        while(start<=end){

            var mid = start+(end-start)/2
            //mil jaye
            if(nums[mid]==target) return mid
         
            //left side 
            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && nums[mid]>target){
                    end=mid-1
                }
                else{
                    start=mid+1
                }
            }
            //riight
            else{
                if(target>nums[mid] && nums[end]>=target){
                    start=mid+1
                }
                else{
                    end=mid-1
                }
            }
            
        }       

        return -1

    }
}