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
    fun hasCycle(head: ListNode?): Boolean {
        var slowPointer = head
        var fastPointer = head

        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer?.next
            fastPointer = fastPointer?.next?.next

            if(slowPointer == fastPointer){
                return true
            }
        }

        return false
    }
}