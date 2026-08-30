class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {

        if(s.length != t.length) return false

        val sMap=HashMap<Char,Char>()
        val tMap=HashMap<Char,Char>()

        for(i in s.indices){
            val charS=s[i]
            val charT=t[i]

            if(sMap.containsKey(charS) && sMap[charS]!=charT)
            { return false}

            if(tMap.containsKey(charT) && tMap[charT]!=charS) 
            {return false}

            sMap[charS]=charT
            tMap[charT]=charS
        }
        return true
        
    }
}