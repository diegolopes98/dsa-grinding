class Solution:
    def isPowerOfTwo(self, n: int, p: int = 0) -> bool:
        power = 2**p
        if power > n:
            return False

        if power == n:
            return True

        return self.isPowerOfTwo(n, p + 1)
