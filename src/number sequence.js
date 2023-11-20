

// 5 4 3 2 1
// 5 4 3 2
// 5 4 3
// 5 4
// 5

let n = 5;
let str = "";
for(i=1; i<=n; i++){
    for(j=n; j>=i; j--){
        str += j + " " ;
    }  
    str += "\n";
}
console.log(str)


