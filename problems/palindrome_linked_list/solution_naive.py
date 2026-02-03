from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def isPalindrome(head: Optional[ListNode]) -> bool:
    size = 0
    sizeNode = head
    while sizeNode:
        size += 1
        sizeNode = sizeNode.next
    half = size // 2
    remain = size % 2

    stack = []

    curr = 0
    while curr < half:
        stack.append(head.val)
        head = head.next
        curr += 1

    if remain != 0:
        head = head.next

    while head:
        sval = stack.pop()
        if head.val != sval:
            return False
        head = head.next
    return True
