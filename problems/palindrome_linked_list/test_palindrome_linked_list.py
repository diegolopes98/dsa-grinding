from problems.palindrome_linked_list.solution_naive import (
    ListNode,
    isPalindrome as isPalindromeNaive,
)
from problems.palindrome_linked_list.solution_reverse_half import (
    isPalindrome as isPalindromeReverseHalf,
)
from test_utils.base_in_out_test import BaseInOutTestCase


def create_linked_list(values):
    if not values:
        return None

    head = ListNode(values[0])
    current = head
    for val in values[1:]:
        current.next = ListNode(val)
        current = current.next
    return head


class TestMergeTwoSortedLists(BaseInOutTestCase):
    @staticmethod
    def function_wrapper_naive(list1_values):
        return isPalindromeNaive(create_linked_list(list1_values))

    @staticmethod
    def function_wrapper_reverse(list1_values):
        return isPalindromeReverseHalf(create_linked_list(list1_values))

    function_under_test = [function_wrapper_naive, function_wrapper_reverse]

    test_cases = [
        ("empty", ([],), True),
        ("one item", ([1],), True),
        ("two items palindrome", ([1, 1],), True),
        ("two items not palindrome", ([0, 1],), False),
        ("three items palindrome", ([1, 0, 1],), True),
        ("three items not palindrome", ([0, 0, 1],), False),
    ]


if __name__ == "__main__":
    import unittest

    unittest.main()
