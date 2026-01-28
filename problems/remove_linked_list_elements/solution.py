from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeElements(self, curr: Optional[ListNode], val: int) -> Optional[ListNode]:
        dummy = ListNode(0, curr)
        head = dummy

        while dummy:
            while dummy.next and dummy.next.val == val:
                dummy.next = dummy.next.next
            dummy = dummy.next

        return head.next
