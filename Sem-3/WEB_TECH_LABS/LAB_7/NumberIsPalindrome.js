let num=121;

let temp=num.toString()
let temp2=''
for(let i=temp.length-1;i>=0;i--){
    temp2 += temp.charAt(i);
}
if(temp==temp2)
    console.log("Number is palindrome.");
else
    console.log("Number is not palindrome.");