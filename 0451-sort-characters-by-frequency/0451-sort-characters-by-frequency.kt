class Solution {
    fun frequencySort(s: String): String {
        val map = HashMap<Char,Int>()

        val ans =  StringBuilder()

        for(i in s.indices){
            map[s[i]]= (map[s[i]] ?: 0)+1
        }

        val sorted = map.entries.sortedByDescending{it.value}

        for( (ch,freq) in sorted){
            repeat(freq){
                ans.append(ch)
            }
        }
        return ans.toString()
    }
}