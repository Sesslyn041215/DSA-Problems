// //////////////////////////////////second sum -Number diamond for n=4/////////////////////////////
// 4 3 2 1 
// 3 2 1 
// 2 1 
// 1 

let n = 4;
for(let i = n; i>=1; i--){
  let string = " ";
  for(let j = i; j>=1; j--){
    string += j + " ";
  }
  console.log(string);
}

