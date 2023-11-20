

let array_student_obj
 = [{name:"Nanda",
     age:19,
     salary: 10000,
     marks:{
            maths:80,
            physics: 78,
            chemistry:90
        }
     },
     {name:"Deepika",
     age:22,
     salary: 10000,
     marks:{
            maths:95,
            physics: 95,
            chemistry:89
        }
     },
     {name:"Boopalan",
     age:22,
     salary: 10000,
     marks:{
            maths:76,
            physics: 81,
            chemistry:76
        }
     },{name:"Karthi",
     age:20,
     salary: 10000,
     marks:{
            maths:67,
            physics: 51,
            chemistry:39
        }
     }];

     //Highest age - name
     let n = array_student_obj.length;
     let max = array_student_obj[0].age;
     for(let i=0; i<n;i++){
        if(array_student_obj[i].age>max){
            max=array_student_obj[i].age;
            output=array_student_obj[i].name
            console.log(output)
        }
     }
    
     
   


 
		
