from problems.power_of_three.solution_rec import isPowerOfThree as is_power_of_three_rec
from test_utils.base_in_out_test import BaseInOutTestCase


class TestPowerOfThree(BaseInOutTestCase):
    function_under_test = [is_power_of_three_rec]

    test_cases = [
        ("one is power of three", (1,), True),
        ("small power of three", (3,), True),
        ("sort of small power of three", (81,), True),
        ("large power of three", (1162261467,), True),
        ("not power of three", (2,), False),
        ("large number not power of three", (1000000,), False),
        ("zero", (0,), False),
        ("negative number", (-16,), False),
    ]


if __name__ == "__main__":
    import unittest

    unittest.main()
