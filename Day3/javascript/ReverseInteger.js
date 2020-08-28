function reverse (n) {
  var reverseN = 0
  var sign = n < 0
  n = Math.abs(n)
  while (n) {
    reverseN = reverseN * 10 + (n % 10)
    n = Math.floor(n / 10)
  }
  return reverseN > 0x7FFFFFFF ? 0 : sign ? -reverseN : reverseN
}

console.log(reverse(-123))
console.log(reverse(1563847412))
