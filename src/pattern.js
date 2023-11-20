// # # # # 
// # # # # 
// # # # # 
// # # # # 


// let n = 4;
// let output = "";
// for (let i = 1; i <= n; i++){
//     for(let j = 1; j <= n; j++){
//         output += "#"+ " ";
//     }
//     output += "\n";
// }
// console.log(output);


// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 

// let n = 4;
// let output = "";
// for (let i = 1; i <= n; i++){
//     for(let j = 1; j <= i; j++){
//         output += j + " ";
//     }
//     output += "\n";
// }
// console.log(output)

// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 

// let n = 4;
// let output = "";
// for (let i = 1; i <= n; i++){
//     for(let j = 1; j <= n-i+1; j++){ // for (let j = n; j >= i; j--)
//         output += j + " ";
//     }
//     output += "\n";
// }
// console.log(output)

// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
// 1 2 3 
// 1 2 
// 1 

// let n = 5;
// let output = "";
// for (let i = 1; i <= 2 * n - 1; i++) {
//     let k = i > n ? 2 * n - i : i;  
//     for (let j = 1; j <= k; j++) {   
//         output += j + " ";
//     }
//     output += "\n";
// }
// console.log(output)

//     1 
//    1 2 
//   1 2 3 
//  1 2 3 4 
// 1 2 3 4 5 

// let n = 5;
// let output = "";
// for (let i = 1; i <= n; i++) {
//     for (let s = 1; s <= n - i; s++) {   
//         output += " ";
//     }
//     for (let j = 1; j <= i; j++) {   
//         output += j + " ";
//     }
//     output += "\n";
// }
// console.log(output)

//         1 
//       1 2 
//     1 2 3 
//   1 2 3 4 
// 1 2 3 4 5 
  
// let n = 5;
// let output = "";
// for (let i = 1; i <= n; i++) {
//     output +="  ".repeat(n-i);
//     for (let j = 1; j <= i; j++) {   
//         output += j + " ";
//     }
//     output += "\n";
// }
// console.log(output)

// 1 2 3 4 5 
//   2 3 4 5 
//     3 4 5 
//       4 5 
//         5 


// let n = 5;
// let output = "";
// for (let i = 1; i <= n; i++) {
//     output +="  ".repeat(i-1);
//     for (let j = i; j<=n; j++) {   
//         output += j + " ";
//     }
//     output += "\n";
// }
// console.log(output)

// let candles = [3, 1, 2, 3]
// let max = 0;
// let counter = 0;
// for (let i = 0; i < candles.length; i++) {
//    if (candles[i] > max) {
//      max = candles[i];
//      counter = 1;
//  } else if (candles[i] === max) {
//      counter++;
//  }
// }

// console.log(counter);


let array = [3, 1, 2, 3]
let max = 0;
let str = 0;

for (let i = 0; i < array.length; i++){
    if (array[i] > max){
        max = array[i];
        str = 1; 
    }
    else if (array[i] == max){
        str++;
    }
}

console.log(str); 


 

