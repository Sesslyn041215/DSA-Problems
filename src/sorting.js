<<<<<<< HEAD
//Bubble Sorting
let arr = [10, 8, 13, 3, 16];
let n = 5;
// for(let i=0; i<=n-1; i++){
//     for (let j=0; j<=n-i-1; j++){
//         if(arr[j]>arr[j+1]){
//             const temp = arr[j]
//             arr[j] = arr[j+1]
//             arr[j+1] = temp;
//         }
//     }
// }
// console.log(arr);

//Selection sorting
for (i = 0; i < n - 1; i++) {
   let temp = i;
    for (let j = i + 1; j < n; j++) {
        if (arr[j] < arr[temp]) {
        temp = j;
        }
    }
    let tmp = arr[i];
    arr[i] = arr[temp];
    arr[temp] = tmp;
}
console.log(arr);


=======
//Bubble Sorting
let arr = [10, 8, 13, 3, 16];
let n = 5;
// for(let i=0; i<=n-1; i++){
//     for (let j=0; j<=n-i-1; j++){
//         if(arr[j]>arr[j+1]){
//             const temp = arr[j]
//             arr[j] = arr[j+1]
//             arr[j+1] = temp;
//         }
//     }
// }
// console.log(arr);

//Selection sorting
for (i = 0; i < n - 1; i++) {
   let temp = i;
    for (let j = i + 1; j < n; j++) {
        if (arr[j] < arr[temp]) {
        temp = j;
        }
    }
    let tmp = arr[i];
    arr[i] = arr[temp];
    arr[temp] = tmp;
}
console.log(arr);


>>>>>>> 39c4b325c931162f6dda8f9206bfde99e9a73ec4
