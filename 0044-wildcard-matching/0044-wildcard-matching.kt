class Solution {
    fun isMatch(s: String, p: String): Boolean {
        // Memoization table:
        // null = abhi calculate nahi hua
        // true / false = pehle se save kiya hua result
        val memo = Array(s.length + 1) { arrayOfNulls<Boolean>(p.length + 1) }

        fun solve(i: Int, j: Int): Boolean {
            // 1. Base Case: Pattern khatam ho gaya
            if (j == p.length) {
                return i == s.length // True tabhi jab string bhi khatam ho
            }

            // 2. Agar is (i, j) ka answer pehle se pata hai, toh wahi return kar do
            if (memo[i][j] != null) {
                return memo[i][j]!!
            }

            var result = false

            if (p[j] == '*') {
                // Option 1: '*' ko ignore karo (0 characters match)
                val skipStar = solve(i, j + 1)
                
                // Option 2: '*' se s[i] ko match karao (sirf tab jab string bachi ho)
                val useStar = (i < s.length) && solve(i + 1, j)
                
                result = skipStar || useStar
            } else {
                // Normal character ya '?' ke liye current char match hona zaroori hai
                val currentMatch = (i < s.length) && (s[i] == p[j] || p[j] == '?')
                
                if (currentMatch) {
                    result = solve(i + 1, j + 1)
                }
            }

            // Result ko save karo aur return karo
            memo[i][j] = result
            return result
        }

        return solve(0, 0)
    }
}
