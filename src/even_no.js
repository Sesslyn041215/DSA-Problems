<<<<<<< HEAD


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
=======


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
>>>>>>> 39c4b325c931162f6dda8f9206bfde99e9a73ec4
   }