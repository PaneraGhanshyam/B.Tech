let num=153;
let len=0;

let temp=num;
while(temp != 0){
    temp=Math.floor(temp/10);
    len++;
}

temp=num;
let sum=0;
for(let i=1;i<=len;i++){
    let digit=temp%10;
    temp=Math.floor(temp/10);
    sum=sum+Math.pow(digit,len);
}

if(num==sum)
    console.log(num+" is armstrong number.");
else
    console.log(num+" is not armstrong number.")
