const prompt = require("prompt-sync")();
let n=prompt("Enter number:");

function fact(n){
    if(n<=1){
        return 1;
    }else{
        return n*fact(n-1);
    }
}

console.log("Factorial is : "+fact(n));


