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
fs.renameSync('hello.txt','hello1.txt');


//fs.stat
fs.stat('hello.txt',(err,data)=>{
    if (err) {
        console.log(err)
    } else {
        console.log(data);
    }
});
console.log(fs.statSync('hello1.txt'));


//fs.readFile
fs.readFile('hello.txt','utf-8',(err,data)=>{
    if (err) {
        console.log(err)
    } else {
        console.log(data);
    }
});
console.log(fs.readFileSync('hello1.txt','utf-8'));


// fs.writeFile
fs.writeFile('hello.txt','kem choo ???',(err)=>{
    console.log(err);
});
fs.writeFileSync('hello1.txt','kem cho ??');
console.log(fs.readFileSync('hello1.txt','utf-8'));



//fs.appendFile
fs.appendFile('hello.txt','majama ne badha.',(err)=>{
    console.log(err);
});
fs.appendFileSync('hello1.txt','majama ne badha.');
console.log(fs.readFileSync('hello1.txt','utf-8'));



//fs.unlink
fs.unlink('hello.txt',(err)=>{
    console.log(err)
})
fs.unlinkSync('hello1.txt');
