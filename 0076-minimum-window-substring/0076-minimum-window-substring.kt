
class Solution {
    fun minWindow(s: String, t: String): String {

        if (s.length < t.length) return ""

        val map = mutableMapOf<Char, Int>()
        val hash = mutableMapOf<Char, Int>()

        var left = 0
        var formed = 0
        var minLen = Int.MAX_VALUE
        var start = 0

        // Required frequency
        for (ch in t) {
            map[ch] = (map[ch] ?: 0) + 1
        }

        val required = map.size

        for (right in s.indices) {

            // Add character to window
            val ch = s[right]
            hash[ch] = (hash[ch] ?: 0) + 1

            // Check if required frequency is satisfied
            if (map.containsKey(ch) &&
                hash[ch] == map[ch]) {
                formed++
            }

            // Window valid hai, ab chhoti karo
            while (formed == required) {
  
                val windowSize = right - left + 1

                // Store minimum window and store start
                if (windowSize < minLen) {
                    minLen = windowSize
                    start = left
                }

                val leftChar = s[left]

                // Removing this char will break validity
                if (map.containsKey(leftChar) &&
                    hash[leftChar] == map[leftChar]) {
                    formed--
                }

                hash[leftChar] = hash[leftChar]!! - 1
                left++
            }
        }

        if (minLen == Int.MAX_VALUE) return ""

        return s.substring(start, start + minLen)
    }
}
