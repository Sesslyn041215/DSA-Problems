

let array_student_obj
    = [{
        name: "Nanda",
        age: 19,
        salary: 10000,
        marks: {
            maths: 80,
            physics: 78,
            chemistry: 90
        }
    },
    {
        name: "Deepika",
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
        age: 27,
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
            physics: 81,
            chemistry: 39
        }
    }];

//Highest mark
let n = array_student_obj.length;
let max = array_student_obj[0].marks.physics;
let object = array_student_obj[0].name;
for (let i = 0; i < n; i++) {
    if (array_student_obj[i].marks.physics > max) {
        max[80] = array_student_obj[i].marks.physics;
        output = array_student_obj[i].name
        console.log(output)
    }
}
