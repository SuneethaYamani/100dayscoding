/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function (nums, k) {
    //   console.log(nums)
      for (let i = 0; i < k; i++) {
        const itemPopped = nums.pop()
        console.log('before shift', nums)
        nums.unshift(itemPopped)
        console.log('after shift', nums)
      }
    //   console.log(nums)
    }
    rotate([1, 2, 3, 4, 5, 6, 7], 3)
    