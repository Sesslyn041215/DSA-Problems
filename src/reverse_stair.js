<<<<<<< HEAD


//5 4 3 2 1 
//4 3 2 1 
//3 2 1 
//2 1 
//1 

 function series(n){
    str = " ";
    for(let i = n; i >= 1; i--){ 
     str += i + " ";
    }
    console.log(str)
   }
  
   let j = 5;
  
   for(let i=1; i<=j; i++){
    let n = j-i+1;
    series(n);
=======


//5 4 3 2 1 
//4 3 2 1 
//3 2 1 
//2 1 
//1 

 function series(n){
    str = " ";
    for(let i = n; i >= 1; i--){ 
     str += i + " ";
    }
    console.log(str)
   }
  
   let j = 5;
  
   for(let i=1; i<=j; i++){
    let n = j-i+1;
    series(n);
>>>>>>> 39c4b325c931162f6dda8f9206bfde99e9a73ec4
   }