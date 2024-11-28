function add(a,b){
    return a+b;
}
function sum(n1,n2 ,callback){
    console.log("Sum is "+callback(n1,n2));
}

sum(10,20,add);