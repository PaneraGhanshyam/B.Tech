const child_process = require('child_process');

// child_process.exec('ping google.com',(err,stdout,stderr)=>{

//     if(err){
//         console.log(err);
//     }else{
//         console.log(stdout);
//         console.log(stderr);
//     }
// });

console.log(child_process.execSync('ping google.com').toString());