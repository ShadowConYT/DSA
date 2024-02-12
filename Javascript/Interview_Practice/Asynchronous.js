// Async Returns a Promise
// Await is used to wait for a promise to resolve
// Async/Await is a modern way of handling asynchronous code in Javascript

function walkDog(){
    return new Promise((resolve, reject) => {

        setTimeout(() =>{
        let dogwalked = false;

        if (dogwalked){
            resolve('Dog walked');
        }
        else {
            reject('Dog not walked');
        }
    }, 1500)
    })
}

function cleanRoom(){
    return new Promise((resolve, reject) => {
        setTimeout(() =>{
        let roomcleaned = true;

        if (roomcleaned){
            resolve('Room cleaned');
        }
        else {
            reject('Room not cleaned');
        }
    }, 2500)
    })
}

function cookDinner(){
    return new Promise((resolve, reject) => {
        setTimeout(() =>{
        let dinnercooked = true;

        if (dinnercooked){
            resolve('Dinner cooked');
        }
        else {
            reject('Dinner not cooked');
        }
    }, 3500)
    })
}

async function doChores(){

    try{
    const walked = await walkDog();
    console.log(walked);

    const cleaned = await cleanRoom();
    console.log(cleaned);

    const cooked = await cookDinner();
    console.log(cooked);
    }

    catch(err){
        console.log(err);
    }
}

doChores(); // Dog walked, Room cleaned, Dinner cooked


// Practicing with RestAPI


async function getPosts(){
    await fetch('https://jsonplaceholder.typicode.com/todos/1')
    .then(res => res.json())
    .then(data => console.log(data))
    .catch(err => console.log(err))
}

getPosts()// {userId: 1, id: 1, title: "delectus aut autem", completed: false}