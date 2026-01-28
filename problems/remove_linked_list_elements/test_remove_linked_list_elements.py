from problems.remove_linked_list_elements.solution import Solution, ListNode
from test_utils.base_in_out_test import BaseInOutTestCase


def create_linked_list(values):
    """Helper function to create a linked list from a list of values"""
    if not values:
        return None

    head = ListNode(values[0])
    current = head
    for val in values[1:]:
        current.next = ListNode(val)
        current = current.next
    return head


def linked_list_to_list(head):
    """Helper function to convert a linked list to a list of values"""
    result = []
    current = head
    while current:
        result.append(current.val)
        current = current.next
    return result


class TestRemoveLinkedListElements(BaseInOutTestCase):
    @staticmethod
    def function_wrapper(list_values, val):
        """Wrapper function that takes a list of values and a value to remove"""
        head = create_linked_list(list_values)
        solution = Solution()
        result = solution.removeElements(head, val)
        return linked_list_to_list(result)

    function_under_test = [function_wrapper]

    test_cases = [
        ("remove from middle and end", ([1, 2, 6, 3, 4, 5, 6], 6), [1, 2, 3, 4, 5]),
        ("empty list", ([], 1), []),
        ("remove all elements", ([7, 7, 7, 7], 7), []),
        ("single element removed", ([1], 1), []),
        ("single element not removed", ([1], 2), [1]),
        ("remove consecutive from beginning", ([1, 1, 2, 3], 1), [2, 3]),
        ("remove consecutive from end", ([1, 2, 3, 3], 3), [1, 2]),
        ("remove consecutive in middle", ([1, 2, 3, 3, 3, 4, 5], 3), [1, 2, 4, 5]),
        ("no matches", ([1, 2, 3, 4], 5), [1, 2, 3, 4]),
        ("alternating pattern", ([1, 2, 1, 2, 1, 2], 1), [2, 2, 2]),
        ("remove all but one", ([1, 1, 2, 1, 1], 1), [2]),
        ("two elements remove first", ([1, 2], 1), [2]),
        ("two elements remove second", ([1, 2], 2), [1]),
    ]


if __name__ == "__main__":
    import unittest

    unittest.main()
