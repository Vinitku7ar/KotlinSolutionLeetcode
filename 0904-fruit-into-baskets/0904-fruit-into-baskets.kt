class Solution {
    fun totalFruit(fruits: IntArray): Int {
        var left =0;
        var maxi =0
        val hash = mutableMapOf<Int,Int>()
        for(right in fruits.indices){
            val curr = fruits[right]
            hash[curr] = (hash[curr]?:0)+1
            while(hash.size >2){
                val rfru = fruits[left]
                hash[rfru] = hash[rfru]!!-1
                if(hash[rfru]==0){
                    hash.remove(rfru)
                }
                left++
            }
            maxi = maxOf(right-left+1,maxi)
        }
        return maxi
    }
}