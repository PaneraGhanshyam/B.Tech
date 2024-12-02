const prompt = require("prompt-sync")();
let n = prompt("Enter number: ");

function findFactors(n) {
    let factors = [];
    for (let i = 1; i <= n; i++) {
        if (n % i === 0) {
            factors.push(i); 
        }
    }
    return factors;
}

console.log("Factors are: " + findFactors(n).join(", "));
