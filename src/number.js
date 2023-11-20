//1 2 3 4 5 4 3 2 1 

let n = 5
let num = "";
for(let i = 1; i <=n; i++) {
  num += i + " ";
}
for(let i = n-1; i >=1; i--) {
    num += i + " ";
}
console.log(num);


