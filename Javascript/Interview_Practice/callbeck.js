function fetchData(url, callback){
    setTimeout(() => {
        callback('Done!');
    }, 1500);
}

function myDisplayer(some){
    console.log("this is myDisplayer: " + some);
};

function myCalculator(num1, num2, myCallback){
    let sum = num1 + num2;
    myCallback(sum);
};

myCalculator(5, 5, myDisplayer);