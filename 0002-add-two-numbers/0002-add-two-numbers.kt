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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        var p1: ListNode? = l1
        var p2: ListNode? = l2

        var carry = 0

        var resultHead: ListNode? = null
        var resultTail: ListNode? = null

        while (p1 != null || p2 != null) {

            val num1 = p1?.`val` ?: 0
            val num2 = p2?.`val` ?: 0

            val sum = num1 + num2 + carry

            val digit = sum % 10
            carry = sum / 10

            val newNode = ListNode(digit)

            if (resultHead == null) {
                resultHead = newNode
                resultTail = newNode
            } else {
                resultTail?.next = newNode
                resultTail = newNode
            }

            p1 = p1?.next
            p2 = p2?.next
        }

        if (carry > 0) {
            resultTail?.next = ListNode(carry)
        }

        return resultHead
    }
}