let count=0;
let start=10;
let end=100;
for(start;start<=end;start++){
    for(let i=1;i<=start;i++){
        if(start%i==0)
            count++;
    }
    if(count==2){
        console.log(start);
        count=0;
    } else{
        count=0;
    }
}

