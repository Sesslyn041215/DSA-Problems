
// let string = "Amma";
// let output = "";
// let stringLower =    string.toLowerCase();
// for (let i = string.length - 1; i >= 0; i--) { 
//     output = output+stringLower[i]; 
// }

// if(stringLower == output){
//     console.log("It is palindrome")
// }
// else{
//     console.log("It is not palindrome")
// }



let string="madam";
let n=string.length; 
let stringLower = string.toLowerCase();
let m;
if(n%2!==0){
  m=n/2-0.5
}
else{
  m=n/2
}
let yes=false;
for(let i=0;i<m;i++){
  if(stringLower[i]===stringLower[n-i-1]){
    yes=true;
  }
  else{
    yes=false;
  }
}
if(yes===true){
  console.log(""+stringLower+" is a palindrone")
}
else{
console.log(""+stringLower+" not a palindrone")
}