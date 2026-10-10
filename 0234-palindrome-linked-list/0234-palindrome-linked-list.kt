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
    fun reverse(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr: ListNode? = head
        var nextNode: ListNode?
        while (curr != null) {
            nextNode = curr.next
            curr.next = prev
            prev = curr
            curr = nextNode
        }
        return prev
    }
    
    fun isPalindrome(head: ListNode?): Boolean {
        if (head == null || head.next == null) return true
        
        var slow: ListNode? = head
        var fast: ListNode? = head
        
        while ( fast?.next != null) {
            fast = fast.next?.next
            slow = slow?.next
        }
        println(slow?.`val`)
        
        val reverseHead = reverse(slow)
        var temp1: ListNode? = head
        var temp2: ListNode? = reverseHead
        
        while (temp2 != null) {
            if (temp1?.`val` != temp2.`val`) return false
            temp1 = temp1.next
            temp2 = temp2.next
        }
        
        return true
    }
}