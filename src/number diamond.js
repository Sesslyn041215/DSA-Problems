// //////////////////////////////////second sum -Number diamond for n=4/////////////////////////////
//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 
//  3 3 3 
//   2 2 
//     1 

let n = 4;
let string = "";
for (let i = 1; i <= n; i++) {
  for (let j = 1; j <= n - i; j++) {
    string += " ";
  }
  for (let k = 1; k <= i; k++) {
    string += i + " ";
  }
  string += "\n";
}
for (let i = n - 1; i >= 1; i--) {
  for (let j = 1; j <= n - i; j++) {
    string += " ";
  }
  for (let k = 1; k <= i; k++) {
    string += i + " ";
  }
  string += "\n";
}
console.log(string);
