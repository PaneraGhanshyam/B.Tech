function varScopeExample() {
    console.log("value of x before declaration "+x);//undefine
    if (true) {
        var x = 10; 
        console.log("value of x inside if "+x);
    }
    console.log("value of x outside if "+x);
}

function letScopeExample() {
    //console.log("value of y before declaration "+y); ReferenceError: y is not defined
    if (true) {
        let y = 20; 
        console.log("value of y inside if "+y);
    }
    //console.log("value of y outside if "+y); ReferenceError: y is not defined
}

varScopeExample();
letScopeExample();
