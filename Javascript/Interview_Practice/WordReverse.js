// Given a string, reverse each word in the sentence

// Problem
// For example Welcome to this Javascript Guide! should be become emoc1eW ot siht tpircsavaJ !ediuG

function wordReverse(str){
    return str.split('').reverse().join('')
}

console.log(wordReverse('Welcome to this Javascript Guide!'))