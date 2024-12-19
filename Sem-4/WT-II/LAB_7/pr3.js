const express=require('express')
const fs=require('fs')
const PORT=3000;

const app=express()

app.get('/',(req,res)=>res.end(fs.readFileSync('home.txt','utf-8')))

app.get('/about',(req,res)=>res.end(fs.readFileSync('about.txt','utf-8')))

app.get('/contact',(req,res)=>res.end(fs.readFileSync('contact.txt','utf-8')))

app.get('/products',(req,res)=>res.end(fs.readFileSync('product.txt','utf-8')))

app.listen(PORT,()=>{
    console.log(`Server started at port:${PORT}`)
})