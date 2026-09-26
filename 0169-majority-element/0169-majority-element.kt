class Solution {
    fun majorityElement(nums: IntArray): Int {
        var candidate=0
        var balance=0
        for(num in nums){
            if(balance==0){
                candidate=num
            }
            if(num == candidate){
                balance++
            }
            else{
                balance--
            }
        }
        return candidate
    }
}