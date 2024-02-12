const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const str = 'Hello World';

function isArray(arr){
    if (typeof arr === 'object' ){
        return true;
    }
    return false;
}

console.log(isArray(arr)); // true
console.log(isArray(str)); // false


// Checking Splice and Slice

console.log(parseInt('1001H22')); // 9