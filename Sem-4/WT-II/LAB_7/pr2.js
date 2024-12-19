const express = require('express');
const PORT=3000;

const app=express();

app.get('/',(req,res)=>{
    res.end("Home page.");
});

app.get('/about',(req,res)=>{
    res.end("About page.");
});

app.get('/contact',(req,res)=>{
    res.end("ContactUs page.");
});

app.get('/products',(req,res)=>{
    res.end("Products page.");
});

app.listen(PORT,()=>{
    console.log(`Server started at port:${PORT}`);
});