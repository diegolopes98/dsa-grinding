def isPowerOfThree(n: int, p: int = 0) -> bool:
    power = 3**p
    if power > n:
        return False

    if power == n:
        return True

    return isPowerOfThree(n, p + 1)
