const fs = require('fs');

const student = fs.readFileSync('student.txt', 'utf-8');
let list = student.split('\n');

let studentMap = list
    .map(line => {
        const [id, name, enno, mobileno, dept, spi] = line.split(',');
        return { id, name, enno, mobileno, dept, spi: parseFloat(spi) }; 
    })
    .filter(student => student.spi <= 5) 
    .map(student => [student.id, student]); 

studentMap.forEach(student => console.log(student));
