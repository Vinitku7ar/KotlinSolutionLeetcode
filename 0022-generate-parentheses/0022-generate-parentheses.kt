class Solution {

    fun solve(open: Int, close: Int, ans: MutableList<String>, output: String) {
        // base case 
        if (open == 0 && close == 0) {   
            ans.add(output)
            return 
        }
        
        // include open
        if (open > 0) {
            // 2. Pass the new string directly into the function instead of mutating 'output'
            solve(open - 1, close, ans, output + '(')
        }
        
        // include close
        if (close > open) {
            // 2. Pass the new string directly into the function instead of mutating 'output'
            solve(open, close - 1, ans, output + ')')
        }
    }

    fun generateParenthesis(n: Int): List<String> {
         val open = n
        val close = n
        // 3. Used mutableListOf<String>() instead of listOf()
        val ans = mutableListOf<String>()
        val output = ""
        
        // 4. Fixed argument order to match the function definition (ans, then output)
        solve(open, close, ans, output)
        return ans
    }
}