class Student {

     constructor(id, name, age) {

         this.id = id;

         this.name = name;

     this.age = age;

     }

}


class StudentManager {

     constructor() {

         this.students = [];

     }


     // 1. Add Student

     addStudent(id, name, age) {

     if (!id || !name || !age) {

     return "Error: All fields are required.";
    }

    if (this.students.some(student => student.id === id)) {

         return "Error: Student ID must be unique.";

     }

     const student = new Student(id, name, age);

     this.students.push(student);

     return "Student added successfully.";

     }


 // 2. Retrieve Student by ID

 getStudentById(id) {

     const student = this.students.find(student => student.id === id);

     if (student) {

     return student;

     } else {

     return "Student not found.";

     }

 }


     // 3. Update Student

   updateStudent(id, name, age) {

    const student = this.students.find(student => student.id === id);

        if (student) {

             student.name = name;

             student.age = age;
    return "Student updated successfully.";

     } else {

        return "Student not found.";

     }

}


 // 4. Delete Student

deleteStudent(id) {

    const index = this.students.findIndex(student => student.id === id);

     if (index !== -1) {

        this.students.splice(index, 1);

             return "Student deleted successfully.";

         } else {

             return "Student not found.";

         }
     }

     // 5. Get All Students

    getAllStudents() {

    return this.students;

     }

}


// Example usage:

const manager = new StudentManager();

console.log(manager.addStudent(1, "John Doe", 20));

console.log(manager.addStudent(2, "Jane Smith", 22));

console.log(manager.getStudentById(1));

console.log(manager.updateStudent(1, "John Updated", 21));

console.log(manager.deleteStudent(2));

console.log(manager.getAllStudents());