function isPalindrome(arr){
    return arr === arr.split('').reverse().join('')
}

console.log(isPalindrome('racecar')) // true
console.log(isPalindrome('hello')) // false