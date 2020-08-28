const n = 10

var countPrimes = function (n) {

  // build array to mark
  const nums = [...Array(n).keys()]

  for (let i = 2; i * i < n; i++) {
    if (nums[i] !== 'nope') {
      for (let j = i * i; j < n; j += i) {
        nums[j] = 'nope'
      }
    }
  }

  const primes = []

  for (let i = 0; i < nums.length; i++) {
    if (nums[i] > 1) {
      primes.push(nums[i])
    }
  }

  console.log(primes)
  return primes.length
}

countPrimes(n)
