//Find min
let a = [1,2,4,2,5,9];
let min = a[0];
for(let i = 1; i<a.length; i++){
    if(min > a[i]){
        min = a[i];
    }
}
console.log(min)