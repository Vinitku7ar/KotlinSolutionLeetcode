class Solution {
    fun myPow(x: Double, n: Int): Double {
        
        // base case, i.e if n = 0, return 1
        if (n == 0){
            return 1.0
        }

        // for negative numbers
        if (n < 0){
            var x = 1.0 / (x * myPow(x, -(n + 1)))
            return x
        }

        // for any recursive case
        // splitting the problem into 2 half and then solving

        val half = myPow(x, n/2)
        return if (n % 2 == 0) {
            half * half
        }
        else {
            x * half * half
        }
    }
}