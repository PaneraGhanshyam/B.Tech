const fs=require('fs');

const student=fs.readFileSync('student.txt','utf-8');
console.log(student.match(/[aeiouAEIOU]/g).length);