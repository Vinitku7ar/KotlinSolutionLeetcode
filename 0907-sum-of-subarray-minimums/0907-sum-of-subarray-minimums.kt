class Solution {
    fun sumSubarrayMins(arr: IntArray): Int {
        val n = arr.size
        val left = IntArray(n)
        val right= IntArray(n)
        val st = java.util.Stack<Int>()

        //previous smaller element 
        for(i in 0 until n){
            while(st.isNotEmpty() && arr[st.peek()]>arr[i]){
                st.pop()
            }
            left[i]=if(st.isEmpty()) -1 else st.peek()
            st.push(i)
        }

        st.clear()
        //next smaller element 
        for(i in n-1 downTo 0){
            while(st.isNotEmpty() && arr[st.peek()]>=arr[i]){
                st.pop()
            }
            right[i]=if(st.isEmpty()) n else st.peek()
            st.push(i)
        }
        val mod = 1_000_000_007L
var ans = 0L

                for (i in 0 until n) {
            val leftCount = i - left[i]
            val rightCount = right[i] - i

            ans = (ans + arr[i].toLong() * leftCount * rightCount) % mod
        }

return ans.toInt()
    }
}