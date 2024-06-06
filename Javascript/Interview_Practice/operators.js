const studentMarks = {
    "John": {
        "Maths": 80,
        "Science": 90,
        "English": 70
    },
    "Tom": {
        "Maths": 60,
        "Science": "55",
        "English": 80
    },
    "Harry": {
        "Maths": 90,
        "Science": 80,
        "English": 60
    },
}

let studentNames = Object.keys(studentMarks);
let studentMarksArray = Object.values(studentMarks);

studentMarksArray = studentMarksArray.map((marks) => {
    return Object.values(marks).map((mark) => {
        return isNaN(parseInt(mark)) ? 0 : parseInt(mark);
    });
});

console.log(studentMarksArray);

let totalMarks = studentMarksArray.map((marks) => {
    return Object.values(marks).reduce((a, b) => a + b);
});

console.log(totalMarks);