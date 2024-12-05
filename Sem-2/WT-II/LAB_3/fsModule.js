const fs = require('fs') ;


//file exists
fs.exists('hello.txt',(check)=>{
    if (!check) {
        console.log("File not found.");
    } else {
        console.log("File found.")
    }
});
//or    
console.log(fs.existsSync('hello.txt'));

//file rename
fs.rename('hello','hello.txt',(err)=>{
    console.log(err);
});

//fs.stat
fs.stat('hello.txt',(err,data)=>{
    if (err) {
        console.log(err)
    } else {
        console.log(data);
    }
});

//fs.readFile
fs.readFile('hello.txt','utf-8',(err,data)=>{
    if (err) {
        console.log(err)
    } else {
        console.log(data);
    }
});

// fs.writeFile
fs.writeFile('hello.txt','kem choo ???',(err)=>{
    console.log(err);
});

//fs.appendFile
fs.appendFile('hello.txt','majama ne badha.',(err)=>{
    console.log(err);
});


//fs.unlink
// fs.unlink('hello.txt',(err)=>{
//     console.log(err)
// })
