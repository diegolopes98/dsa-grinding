from problems.coin_change_mb.solution import change
from test_utils.base_in_out_test import BaseInOutTestCase


class TestCoinChangeMb(BaseInOutTestCase):
    function_under_test = [change]

    test_cases = [
        (
            "A",
            (
                6,
                [1, 5, 10, 25],
            ),
            {5: 1, 1: 1},
        ),
        (
            "B",
            (
                6,
                [3, 4],
            ),
            {3: 2},
        ),
        (
            "C",
            (
                6,
                [1, 3, 4],
            ),
            {3: 2},
        ),
        (
            "D",
            (
                6,
                [5, 7],
            ),
            {},
        ),
        (
            "E",
            (
                16,
                [5, 7, 9],
            ),
            {9: 1, 7: 1},
        ),
    ]


if __name__ == "__main__":
    import unittest

    unittest.main()
