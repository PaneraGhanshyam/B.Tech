const http = require('http');

const server=http.createServer((req,res)=>{
    console.log(req.url);
    console.log(req.method);

    if(req.url=='/home' && req.method=='GET'){
        res.write("Home page Get method");
    }else if(req.url=='/product' && req.method=='GET'){
        res.write("Product page Get method");
    }else if(req.url=='/contact' && req.method=='GET'){
        res.write("Contact page Get method");
    }else if(req.url=='/about' && req.method=='GET'){
        res.write("About page Get method");
    }else{
        res.write("404 Page Not Found.");
    }

    res.end();
});

const PORT=3000;
server.listen(PORT,()=>{
    console.log(`Server started at port:${PORT}`);
});