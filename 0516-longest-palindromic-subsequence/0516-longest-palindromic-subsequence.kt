class Solution {
   
   fun helper(s :String , i :Int , j :Int,dp:Array<IntArray>):Int{
    //base case
     if(i>j){
        return 0
     }
     if(i==j){
        return 1
     }
     if(dp[i][j]!=-1){
        return dp[i][j]
     }
     
      // var count = Int.MAX_VALUE
       var count =0
     if(s[i]==s[j]){
        count= 2+helper(s,i+1,j-1,dp)
     }
     else{
       val lskip=helper(s,i+1,j,dp)
       val rskip=helper(s,i,j-1,dp) 
       count =maxOf(lskip,rskip)
     }
     dp[i][j]=count
     return dp[i][j]

   }

    fun longestPalindromeSubseq(s: String): Int {
        val dp = Array(s.length){IntArray(s.length){-1}}
      return helper(s,0,s.length-1,dp)
    }
}