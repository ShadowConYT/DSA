function Linear(arr, target){
    for (let i = 0; i < arr.length; i++){
        if (arr[i] == target){
            return i
        }
    }
    return -1
}

let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
let target = 5

console.log(Linear(arr, target)) // 4