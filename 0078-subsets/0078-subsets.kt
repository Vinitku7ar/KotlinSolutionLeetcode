class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {

         val ans = mutableListOf<MutableList<Int>>()
            ans.add(mutableListOf())
            
       for(num in nums ){
        val size = ans.size
         
          for( i in 0 until size){
              val newsub = ans[i].toMutableList()
              newsub.add(num)
              ans.add(newsub)
          }
       }
       return ans   
    }
}