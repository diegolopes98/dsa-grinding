from typing import Dict, List


def change(amount: int, coins: List[int]) -> Dict[int, int]:
    if amount < 0:
        return {}

    if amount == 0:
        return {0: 0}

    cache = [(amount + 1, {}) for _ in range(amount + 1)]
    cache[0] = (0, {})

    for change in range(1, amount + 1):
        for coin in coins:
            if change - coin >= 0:
                if cache[change][0] > cache[change - coin][0] + 1:
                    cache[change] = (
                        cache[change - coin][0] + 1,
                        merge_dict(cache[change - coin][1], {coin: 1}),
                    )

    return cache[amount][1] if cache[amount][0] != amount + 1 else {}


def merge_dict(a: Dict[int, int], b: Dict[int, int]) -> Dict[int, int]:
    result = a.copy()

    for key, value in b.items():
        result[key] = result.get(key, 0) + value

    return result
