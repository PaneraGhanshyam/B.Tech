let num = 10;
let a = 0; 
let b = 1; 

for (let i = 2; i < num; i++) {
    let next = a + b; 
    console.log(next); 
    a = b; 
    b = next;
}
