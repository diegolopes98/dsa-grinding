from problems.power_of_two.solution_rec import isPowerOfTwo as is_power_of_two_rec
from problems.power_of_two.solution_bitman import isPowerOfTwo as is_power_of_two_bitman
from test_utils.base_in_out_test import BaseInOutTestCase


class TestPowerOfTwo(BaseInOutTestCase):
    function_under_test = [is_power_of_two_rec, is_power_of_two_bitman]

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
