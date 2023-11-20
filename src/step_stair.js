// 5 
// 5 4 
// 5 4 3 
// 5 4 3 2 
// 5 4 3 2 1 

// let n = 5;
// let str = "";
// for(i=1; i<=n; i++){
//     for(j=n; j>n-i; j--){
//         str += j + " " ;
//     }  
//     str += "\n";
// }
// console.log(str)


// 1
// 1 2
// 1 2 3
// 1 2 3 4

// let n=4;
// let string="";
// for(let i=1; i<=n; i++){
//     for(let j=1; j<=i; j++){
//         string += j + " ";
//     }
//     string +="\n";
// }
// console.log(string)

// 4 3 2 1 
// 4 3 2 
// 4 3 
// 4 

let n=4;
let string="";
for(let i=1; i<=n; i++){
    for(let j=n; j>=i; j--){
        string += j + " ";
    }
    string +="\n";
}
console.log(string)
