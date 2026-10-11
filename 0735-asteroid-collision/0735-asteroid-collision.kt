class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack = java.util.ArrayDeque<Int>()
    
        for (asteroid in asteroids) {
            var destroyed = false
        
            while (stack.isNotEmpty() && asteroid < 0 && stack.peek() > 0) {
                val topAsteroid = stack.peek()
                if (topAsteroid + asteroid == 0) {
                    stack.pop()
                    destroyed = true
                    break
                } else if (topAsteroid + asteroid < 0) {
                    stack.pop()
                } else {
                    destroyed = true
                    break
                }
            }
            if (!destroyed) {
                stack.push(asteroid)
            }
        }
    
        return stack.reversed().toIntArray()
    }
}