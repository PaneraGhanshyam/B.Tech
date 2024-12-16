const http = require('http');
const fs = require('fs');

const server=http.createServer((req,res)=>{
    console.log(req.url);
    console.log(req.method);

    if(req.url=='/home' || req.url=='/'  && req.method=='GET'){
        res.write(fs.readFileSync('home.txt','utf-8'));
        res.end();
    }else if(req.url=='/product' && req.method=='GET'){
        res.write(fs.readFileSync('product.txt','utf-8'));
        res.end();
    }else if(req.url=='/contact' && req.method=='GET'){
        res.write(fs.readFileSync('contact.txt','utf-8'));
        res.end();
    }else if(req.url=='/about' && req.method=='GET'){
        res.write(fs.readFileSync('about.txt','utf-8'));
        res.end();
    }else{
        res.write("404 Page Not Found.");
        res.end();
    }
    
});


const PORT=4000;
server.listen(PORT,()=>{
    console.log(`Server started at port:${PORT}`);
});