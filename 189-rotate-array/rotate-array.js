var rotate = function(nums, k) {
   const n = nums.length;
  if (n === 0) return;
  k = k % n;
  if (k === 0) return;

  // helper reverse
  const reverse = (l, r) => {
    while (l < r) {
      [nums[l], nums[r]] = [nums[r], nums[l]];
      l++; r--;
    }
  };

  // 1) reverse whole array
  reverse(0, n - 1);
  // 2) reverse first k
  reverse(0, k - 1);
  // 3) reverse rest
  reverse(k, n - 1);
};
