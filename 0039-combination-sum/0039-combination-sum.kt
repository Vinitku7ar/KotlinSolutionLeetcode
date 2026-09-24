class Solution {

   fun helper(candidates: IntArray,target :Int , output : MutableList<Int> , ans : MutableList<List<Int>>,start :Int)
       {

        //base case
        if(target==0){
            ans.add(ArrayList(output))
            return 
        }
        if(target<0){
            return 
        }

       for(i in start until candidates.size ){
           //include 
           val value : Int = candidates[i]

           output.add(candidates[i])

           helper(candidates,target-value,output,ans,i)

           //backtrack
           output.removeAt(output.lastIndex)
    
       }
        

       }

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        
       val output = mutableListOf<Int>()
       val ans = mutableListOf<List<Int>>()

     
       helper(candidates, target , output, ans,0)
       return ans
    }
}