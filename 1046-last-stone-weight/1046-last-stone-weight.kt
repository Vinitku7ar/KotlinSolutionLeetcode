
class Solution {

    fun lastStoneWeight(stones: IntArray): Int {
        val list = stones.toMutableList()
        return helper(list)
    }

    fun helper(stones: MutableList<Int>): Int {

        // Base case
        if (stones.size <= 1) {
            return if (stones.isEmpty()) 0 else stones[0]
        }

        // Find maximum stone
        val first = stones.maxOrNull()!!
        stones.remove(first)

        // Find second maximum stone
        val second = stones.maxOrNull()!!
        stones.remove(second)

        // Smash stones
        if (first != second) {
            stones.add(first - second)
        }

        // Recursive call
        return helper(stones)
    }
}
