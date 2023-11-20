

// **********Consecutive numbers diamond**********
//    1 
//   1 2 
//  1 2 3 
// 1 2 3 4 
//  1 2 3 
//   1 2 
//    1 


let n = 5;
let string = "";
for (let i = 1; i <= n; i++) {
    string += " ".repeat(n-i);
    for (let j = 1; j <= i; j++) {
        string += j + " ";
    }
    console.log(string);
    string = "";
}
// for (let i = n - 1; i >= 1; i--) {
//     string += " ".repeat(n-i);
//     for (let j = 1; j <= i; j++) {
//         string += j + " ";
//     }
//     string += "\n";
// }
// console.log(string);


