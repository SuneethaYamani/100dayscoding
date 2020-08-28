/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfThree = function (n) {
  const num = +(Math.log(n) / Math.log(3)).toFixed(10)
 return !!Number.isInteger(num)
}
console.log(isPowerOfThree(19682))
