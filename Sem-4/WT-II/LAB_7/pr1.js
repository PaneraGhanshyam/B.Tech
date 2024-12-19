const express = require('express');
const PORT=3000;

const app=express();

app.get("/",(req,res)=>{
    res.statusCode=200;
    res.statusMessage="chali gayu ho."
    res.end(`Hello world`);
});

app.listen(PORT,()=>{
    console.log(`Server started at port : ${PORT}`);
});