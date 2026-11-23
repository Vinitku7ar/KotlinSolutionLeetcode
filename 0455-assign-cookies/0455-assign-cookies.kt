class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        val n = g.size
        val m = s.size
        var i=0
        var j=0
        g.sort()
        s.sort()
        while( i < n && j < m){
            if(g[i]<=s[j]) i++
            j++
        }
        return i

    }
}