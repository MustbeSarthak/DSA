class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        n = len(nums)

        left_max = []
        curr_max = nums[0]

        # Find for left MAX
        for i in range(n):
            curr_max = max(curr_max, nums[i])
            left_max.append(curr_max)

        right_min = [0] * n
        curr_min = nums[-1]

        # Find for Right MIN
        for i in range(n - 1, -1, -1):
            curr_min = min(curr_min, nums[i])
            right_min[i] = curr_min

        # FInd stable index
        for i in range(n):
            instability = left_max[i] - right_min[i]

            if instability <= k:
                return i

        return -1