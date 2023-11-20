
// 1 2 3 4 
// 2 . . 2 
// 3 . . 3 
// 1 2 3 4 


let m=4;
let n=4;
for (let i = 1; i <= m; i++) {
    let num = "";
    for (let j = 1; j <= n; j++) {
        if (i==1 | i==n) {
            num += j+ " ";
        }
        else if( j==1 | j==n ){
            num+= i+ " ";
        }else {
            num+=". ";
        }
    }
    console.log(num);
}