class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
      val deque = ArrayDeque<Int>()
      val n = nums.size
      val ans = IntArray(n-k+1)

    
      for(i in 0 until n){
          
          //window size limit kar rhe k size k
          while(deque.isNotEmpty() && deque.first()<=i-k ){
            deque.removeFirst()
          }

          //chota element bhi hatao current element se 
          while(deque.isNotEmpty() && nums[deque.last()]<=nums[i]){
            deque.removeLast()
          }

          //add element now
          deque.addLast(i)

          //window complete hone pe ans store kar window ka
          if(i>=k-1){
            ans[i-k+1]=nums[deque.first()]
          }

      } 
      return ans  
    }
}