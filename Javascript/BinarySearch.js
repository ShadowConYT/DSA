function Binary(arr, target){
    let lo = 0;
    let high = arr.length - 1;

    while(lo <= high){
        let mid = Math.floor((high - lo) / 2);

        if (arr[mid] === target){
            return mid;
        }
        if (arr[mid] < target){
            lo = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }
    return -1;
}

let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let target = 5;
console.log(Binary(arr, target)); // 4