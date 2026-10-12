class MinStack() {
    private val list =mutableListOf<Pair<Int,Int>>()

    fun push(value: Int) {
        list += value to minOf(value,list.lastOrNull()?.second?:value)
    }

    fun pop() {
        list.removeAt(list.lastIndex)
    }

    fun top(): Int {
       return list.last().first
    }

    fun getMin(): Int {
       return list.last().second
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(value)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */