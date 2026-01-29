from problems.power_of_two.solution import Solution
from test_utils.base_in_out_test import BaseInOutTestCase


class TestPowerOfTwo(BaseInOutTestCase):
    @staticmethod
    def function_wrapper(n):
        """Wrapper function that takes an integer and returns if it's a power of two"""
        solution = Solution()
        return solution.isPowerOfTwo(n)

    function_under_test = [function_wrapper]

    test_cases = [
        ("one is power of two", (1,), True),
        ("small power of two", (16,), True),
        ("large power of two", (1073741824,), True),
        ("not power of two", (3,), False),
        ("large number not power of two", (1000000,), False),
        ("zero", (0,), False),
        ("negative number", (-16,), False),
    ]


if __name__ == "__main__":
    import unittest

    unittest.main()
