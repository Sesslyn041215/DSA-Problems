// 1
//   2
//     3
//       4
//         3
//           2
//             1
let n=4;
for (let i = 1; i <= n; i++) {
    console.log("  ".repeat(i-1) + (i))
}
for(let i=3;i>=1;i--){
    console.log("  ".repeat(2*n-i-1)+(i))
}