
//      1 
//    1 2 1 
//   1 2 3 2 1 
// 1 2 3 4 3 2 1






let n = 4; 
let output = ''; 
for (let i = 0; i <= n; i++) {
  let row = '';
  for (let j = 0; j <= n - i; j++) {
    row += '  ';
  }
  for (let j = 0; j <= i; j++) {
    row += j + ' ';
  }
  for (let j = i - 1; j >= 0; j--) {
    row += j + ' ';
  }
  output += row + '\n';
}
console.log(output);