class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
     
        val hash = mutableMapOf<Char,Int>()
        var maxi =0
        var left =0
        var right =0
        while(right<s.length){
            val curr = s[right]
           if(hash.containsKey(curr)){
               left = maxOf(left, hash[curr]!! + 1)
           }
           hash[curr]=right
           maxi = maxOf(maxi, right - left + 1)

           right++
        }
        return maxi
    }
}