const EventEmitter=require('events');

class Event extends EventEmitter{}

const e1=new Event();

e1.on("print_helloworld",()=>{
    console.log("Hello World.");
})

setTimeout(()=>{
    e1.emit("print_helloworld");
},2000);

