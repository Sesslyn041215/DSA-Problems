

//Find the maximum number in the array


let a=[7,5,8,9,6,11]
let max = a[0]
for(let i=1; i<a.length; i++){
    if(max < a[i]){
        max = a[i]
    }
}
console.log(max)


