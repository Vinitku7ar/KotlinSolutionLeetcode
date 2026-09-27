class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val map = HashMap<Int,Boolean>()
        var ans=0
        for(num in nums){
            map[num]=true
        }

         for(num in nums){
            if(!map.containsKey(num-1)){
                var current = num
                var lenth=1
                
                while(map.containsKey(current+1)){
                    current++
                    lenth++
                }
                ans=maxOf(ans,lenth)

            }
         }
         return ans
    }
}