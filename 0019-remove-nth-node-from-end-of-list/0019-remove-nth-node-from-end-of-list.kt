/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode, n: Int): ListNode? {
        head0.next = head
        var node: ListNode? = head0
        var steps = getNodeCount(head0) - n
        while (steps > 1) {
            steps--
            node = node?.next
        }
        node?.next = node?.next?.next
        return head0.next
    }

    private fun getNodeCount(head: ListNode): Int {
        var count = 0
        var node: ListNode? = head
        while (node != null) {
            node = node.next
            count++
        }
        return count
    }

    companion object {
        val head0 = ListNode(0)
    }
}