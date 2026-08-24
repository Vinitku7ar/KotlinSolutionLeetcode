class Solution {
    fun rearrangeArray(nums: IntArray): IntArray {
        val n = nums.size
        val pos = ArrayList<Int>()
        val neq= ArrayList<Int>()
        val ans = IntArray(n)

        for(i in nums.indices){
            if(nums[i]>0){ pos.add(nums[i]) }
            else{ neq.add(nums[i]) }
        }
        var Index =0

        for(i in pos.indices){
            ans[Index]=pos[i]
            Index++
            ans[Index]=neq[i]
            Index++
        }
        return ans
    }
}