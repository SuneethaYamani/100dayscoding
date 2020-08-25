var containsDuplicate = function (nums) {
  nums.sort()
  for (i = 0; i < nums.length - 1; i++) {
    if (nums[i] == nums[i + 1]) { return true }
  }
  return false
}
console.log(containsDuplicate([1, 6, 5, 2, 3, 4, 5, 6, 7]))
