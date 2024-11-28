function f1(){
    console.log("Hello ");
}
function f2(callback){
    callback();
    console.log("Ghanshyam.");
}
f2(f1);