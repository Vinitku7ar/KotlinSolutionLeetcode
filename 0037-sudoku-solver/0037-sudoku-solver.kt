class Solution {
    data class Point(val row: Int, val col: Int)

    fun solveSudoku(board: Array<CharArray>): Unit {
        val emptyCells = mutableListOf<Point>()
        for (i in 0..<9) {
            for (j in 0..<9) {
                if (board[i][j] == '.') {
                    emptyCells.add(Point(i, j))
                }
            }
        }
        if (emptyCells.size == 0) return

        fun getValidNumbers(row: Int, col: Int): Set<Char> {
            val set = ('1'..'9').toMutableSet()
            for (j in 0..<9) {
                set.remove(board[row][j])
            }
            for (i in 0..<9) {
                set.remove(board[i][col])
            }
            val r = row / 3 * 3
            val c = col / 3 * 3
            for (i in 0..<3) {
                for (j in 0..<3) {
                    set.remove(board[r + i][c + j])
                }
            }
            return set
        }

        var findSolution = false

        fun backtrack(index: Int = 0) {
            if (index == emptyCells.size) {
                findSolution = true
            }
            if (findSolution) return
            val (row, col) = emptyCells[index]
            val validNumbers = getValidNumbers(row, col)
            for (number in validNumbers) {
                if (!findSolution) {
                    board[row][col] = number
                    backtrack(index + 1)
                    if (!findSolution) {
                        board[row][col] = '.'
                    }
                }
            }
        }
        
        backtrack()
    }
}