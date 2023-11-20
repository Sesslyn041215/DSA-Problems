//Linear Search 
let arr=[10, 20, 30, 40, 50];

function linearSearching(arr, x){
for(let i=0; i<arr.length; i++){
    if(x===arr[i])return i;//i = place of 50 arr[i] = returns 50
}
return "x is not found";
}
console.log(linearSearching(arr, 50));