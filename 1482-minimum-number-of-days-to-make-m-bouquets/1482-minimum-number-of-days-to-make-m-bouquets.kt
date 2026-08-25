class Solution {
    fun check(bloomDay :IntArray, m :Int, k:Int,mid :Int) :Boolean{
        var count=0
        var bou=0
        for(bloom in bloomDay){
            if(bloom<=mid){
                count++
                if(count>=k){
                    bou++
                    count=0
                }
            }
            else{
                count=0
            }
       }
       return m<=bou
    }

    fun minDays(bloomDay: IntArray, m: Int, k: Int): Int {
      
      if(bloomDay.size<m*k)return -1
      var low=bloomDay.minOrNull()!!
      var high=bloomDay.maxOrNull()!!

      var ans=-1

      while(low<=high){
        val mid=low+(high-low)/2
        if(check(bloomDay,m,k,mid)){
            ans=mid
            high=mid-1

        }
        else{
           low=mid+1
        }
      }

      return ans

    }
}