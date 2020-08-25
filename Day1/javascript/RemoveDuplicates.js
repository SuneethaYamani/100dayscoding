/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
  nums.splice(0, nums.length, ...(new Set(nums)))
}
const nums = [1, 1, 2, 2, 2, 3, 3, 3]
removeDuplicates(nums)
console.log(nums)
