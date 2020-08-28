/**
 * @param {number} n
 * @return {string[]}
 */
var fizzBuzz = function (n) {
  const result = []
  for (let i = 1; i <= n; i++) {
    let tmp = ''
    if (i % 3 === 0) tmp += 'Fizz'
    if (i % 5 === 0) tmp += 'Buzz'
    if (!tmp) tmp += i
    result.push(tmp)
  }
  return result
}
console.log(fizzBuzz(15))
