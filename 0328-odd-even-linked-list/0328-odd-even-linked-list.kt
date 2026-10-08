class Solution {
    fun oddEvenList(head: ListNode?): ListNode? {

        if (head == null || head.next == null) {
            return head
        }

        var oddPoi = head
        var evenPoi = head.next

        val evenHead = evenPoi

        while (evenPoi != null && evenPoi.next != null) {

            oddPoi?.next = evenPoi.next
            oddPoi = oddPoi?.next

            evenPoi.next = oddPoi?.next
            evenPoi = evenPoi.next
        }

        oddPoi?.next = evenHead

        return head
    }
}