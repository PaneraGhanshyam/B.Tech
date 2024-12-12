const fs=require('fs');

//id,name,eno,mobile no,dep,spi

const stu = `101,aabid1,24010101669,00000000001,CSE,10
102,aabid2,24010101668,00000000002,CSE,9
103,aabid3,24010101667,00000000003,CSE,4.5
104,aabid4,24010101666,00000000004,CSE,7
105,aabid5,24010101665,00000000005,CSE,3.9
`

fs.writeFileSync('student.txt',stu);
