
class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val map = mutableMapOf<Char, Int>()
        var left = 0
        var maxFreq = 0
        var maxLen = 0

        for (right in s.indices) {

            map[s[right]] = (map[s[right]] ?: 0) + 1
            maxFreq = maxOf(maxFreq, map[s[right]]!!)

            while ((right - left + 1) - maxFreq > k) {
                map[s[left]] = map[s[left]]!! - 1
                left++
            }

            maxLen = maxOf(maxLen, right - left + 1)
        }

        return maxLen
    }
}
