const express = require('express');
const bodyParser =require('body-parser');
const PORT=3000;

const app=express();
app.use(bodyParser.json());

let students=[
    {
        name:"ghanshyam",
        rollno:503,
        spi:8.37
    },
    {
        name:"harshil",
        rollno:509,
        spi:6.99
    }
]

app.get('/students',(req,res)=>res.send(students));

app.get('/students/rollno/:id',(req,res)=>{
    res.send(students.find(students=>students.rollno==req.params.id))
})

app.post('/students/insert',(req,res)=>{
    const TEMP=req.body
    students.push(TEMP)
    res.send(students)
})

app.delete('/students/delete/:id', (req, res) => { 
    const studentIndex = students.findIndex(student => student.rollno == req.params.id); 
    if (studentIndex !== -1) {
        students.splice(studentIndex, 1); 
        res.send(students); 
    } else {
        res.status(404).send({ message: "Student not found" }); 
    }
});


app.listen(PORT,()=>{
    console.log(`Server started at port:${PORT}`);
});