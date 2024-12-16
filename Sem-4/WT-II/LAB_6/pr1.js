const http= require('http');

const server=http.createServer((req,res)=>{
    console.log(req.url);
    console.log(req.method);
    res.statusCode=200;
    res.statusMessage="Kai vandho nathi.";
    res.write("This is my first server.");
    res.end("Hello world.");
});

const PORT=6969;
server.listen(PORT,()=>{
   console.log(`Server started at port:${PORT}`); 
});