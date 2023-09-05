class Solution:
    def mySqrt(self, x: int) -> int:
        if x <= 1:
            return x

        low, high = 1, x // 2
        while low <= high:
            mid = low + (high - low) // 2
            sqrt = mid * mid

            if sqrt == x:
                return mid
            elif sqrt < x:
                low = mid + 1
            else:
                high = mid - 1

        return high
