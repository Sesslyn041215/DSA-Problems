// Given 2 numbers it should print if they are equal or not equal,
// let a = 10;
// let b = 20;
// It should either a is equal to b or a is NOT equal to b

// let a=10;
// let b=20;
// let output ="";
// if(a==b){
//     output = "a is equal to b";
// }
// else{
//     output = "a is not equal to b";
// }
// console.log(output)

// For a given positive integer n, it should print every number from 1 to n except x
// for eg:
// let n = 10;
// let x = 5;
// Your program should print 1 2 3 4 6 7 8 9 10
// (everything from 1 to 10 except 5)

// let n = 10;
// let x = 5;
// let string="";
// for (let i = 1; i <= n; i++) {
//   if (i !== x) {
//     string += i+" ";
//   } 
// }
// console.log(string);

// Given an array, print the sum of all even numbers in the array
// let a = [4, 3, 17, 10, 11,12];
// it should print 26

let a = [4, 3, 17, 10, 11,12];
let output = 0;
for(i=0; i<a.length; i++){
  if(a[i]%2==0){
    output = output+a[i];
  }
}
console.log(output)




