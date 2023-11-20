<<<<<<< HEAD
//Linear Search 
let arr=[10, 20, 30, 40, 50];

function linearSearching(arr, x){
for(let i=0; i<arr.length; i++){
    if(x===arr[i])return i;//i = place of 50 arr[i] = returns 50
}
return "x is not found";
}
=======
//Linear Search 
let arr=[10, 20, 30, 40, 50];

function linearSearching(arr, x){
for(let i=0; i<arr.length; i++){
    if(x===arr[i])return i;//i = place of 50 arr[i] = returns 50
}
return "x is not found";
}
>>>>>>> 39c4b325c931162f6dda8f9206bfde99e9a73ec4
console.log(linearSearching(arr, 50));