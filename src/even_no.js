

//2 4 6 8 10
//2 4 6 8
//2 4 6
//2 4
//2

function series(n){
    str = " ";
    for(let i = 1; i <= n; i++){ 
     str += i*2 + " ";
    }
    console.log(str)
   }
  
   let j = 5;
  
   for(let i=1; i<=j; i++){
    let n = j-i+1;
    series(n);
   }