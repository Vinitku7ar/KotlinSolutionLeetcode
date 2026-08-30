class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if (s.length != t.length) return false

        val map1 = HashMap<Char, Int>()
        val map2 = HashMap<Char, Int>()

        for (i in s.indices) {
            map1[s[i]] = (map1[s[i]] ?: 0) + 1
            map2[t[i]] = (map2[t[i]] ?: 0) + 1
        }

        return map1 == map2
    }
}