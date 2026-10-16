class Solution {
    fun numberOfSubstrings(s: String): Int {
        val map = mutableMapOf<Char ,Int>()
        val hash =mutableMapOf<Char,Int>()
        var count =0
        var left=0
        var ans=0
        val n = s.length
        for(char in s){
            map[char]=(map[char]?:0)+1
        }
        val required=3
        for(right in s.indices){
            val ch = s[right]
            hash[ch]=(hash[ch]?:0)+1

            if(hash[ch]==1){
                count++
            }
             
            while(required==count){
                 ans+=n-right
                 val leftChar = s[left]
                hash[leftChar] = hash[leftChar]!! - 1
                if(hash[leftChar]==0){
                    count--
                }
                left++
            }
        }
        return ans 
    }
}