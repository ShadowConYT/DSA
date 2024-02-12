const myNumbers = [4, 1, -20, -7, 5, 9, -6];

function rmNeg(nums, callback){
    const myArr = [];
    for (const x of nums){
        if (callback(x)){
            myArr.push(x);
        }
    }
    return myArr;
}

let pos = rmNeg(myNumbers, (x) => x >= 0)

console.log(pos); // [4, 1, 5, 9]