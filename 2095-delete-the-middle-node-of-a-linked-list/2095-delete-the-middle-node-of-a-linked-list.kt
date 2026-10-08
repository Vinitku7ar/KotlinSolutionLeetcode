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
    fun deleteMiddle(head: ListNode?): ListNode? {
        head?: return null
        head.next?: return null
        var fastPointer = head.next
        var slowPointer = head
        while(fastPointer.next?.next!=null){
            slowPointer = slowPointer?.next
            fastPointer = fastPointer.next?.next 
        }
        slowPointer?.next = slowPointer?.next?.next
        return head
    }
}