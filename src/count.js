
//count x in the array

let a =[1,2,3,5,7,8,7,6,1,1,5,6]
let n = a.length;
let x = 1;
let count = 0;
for(let i=0; i<n; i++){
    if(x==a[i]){
        count++;
    }
}
if(count==0){
    str = x+" is not found"
}
else if(count==1){
    str = x +" is found 1 time"
}
else{
    str = x + " is found "+count+" times "
}
console.log(str)