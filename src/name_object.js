let array_student_obj = [
	{
		name: "Deepika",
		age: 19,
		salary: 10000,
		marks: {
			maths: 80,
			physics: 78,
			chemistry: 90
		}
	},
	{
		name: "Nanda",
		age: 18,
		salary: 10000,
		marks: {
			maths: 95,
			physics: 95,
			chemistry: 89
		}
	},
	{
		name: "Boopalan",
		age: 21,
		salary: 10000,
		marks: {
			maths: 76,
			physics: 81,
			chemistry: 76
		}
	}, {
		name: "Karthi",
		age: 22,
		salary: 10000,
		marks: {
			maths: 67,
			physics: 51,
			chemistry: 39
		}
	}];

let n=false;
let find="Nanda";
let output="";
for(let i=0; i<array_student_obj.length; i++){
    if(find==array_student_obj[i].name){
        n=true
        break;
    }
}
if(n){
    console.log(find+"is found")
}
else{
    console.log(find+"  is not found")
}


	