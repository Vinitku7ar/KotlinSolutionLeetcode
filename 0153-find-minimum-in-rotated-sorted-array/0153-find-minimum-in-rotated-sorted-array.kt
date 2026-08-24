class Solution {
    fun findMin(nums: IntArray): Int {
        var start=0
        var end = nums.lastIndex

        while(start<end){

          val mid = start+(end-start)/2
            //left side 
          if(nums[mid]<=nums[end]){
            end=mid
          }
          else{
            start=mid+1
          }


        }
        return nums[start]
    }
}