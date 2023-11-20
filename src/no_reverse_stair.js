

//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7 
//1 2 3 4 5 6 
//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1

   function series(n){
    str = " ";
    for(let i = 1; i <= n; i++){ 
     str += i + " ";
    }
    console.log(str)
   }
  
   let j = 8;
  
   for(let i=1; i<=j; i++){
    let n = j-i+1;
    series(n);
   }