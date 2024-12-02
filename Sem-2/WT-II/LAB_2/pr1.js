const prompt = require("prompt-sync")();
let n=prompt("Enter number:");
let sum=0;

for(let i=1;i<=n;i++){
    sum=sum+(i*i);
    console.log(i*i);
}

console.log(`Sum is : ${sum}`);