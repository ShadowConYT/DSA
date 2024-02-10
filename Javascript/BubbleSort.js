function Bubble(arr){
    for ( let i = 0; i < arr.length; i++){
        for ( let j = 0; j < arr.length; j++){
            if (arr[j] > arr[j+1]){
                let temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    return arr;
}

let arr = [5, 4, 3, 2, 1];
console.log(Bubble(arr)); // [1, 2, 3, 4, 5]