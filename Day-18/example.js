student = [
    {
        id : 1,
        name : "Manoj",
        age : 22
    },
    {
        id : 2,
        name : "aditya",
        age : 23
    }
]
console.log(student[student.length-1]["name"]);
console.log(student[student.length-1]["age"]);
const num = 10;
console.log("Sum of two numbers " ,num+10);

let car;
car = 1000;
console.log(typeof car);
console.log(typeof(car));
 
const date = new Date();
console.log(date);
console.log(date.getFullYear());
console.log(date.getMonth());
console.log(date.getDate());
console.log(date.getDay(),date.getHours(),date.getMinutes(),date.getSeconds());
let x=5;
console.log(x=="5");
console.log(x==="5");
const d = new Date("April 20,2020");
console.log(d);

let cars = [
    "BMW","AUDI","BENZ",
]
console.log(cars);
console.log(cars[0][1]);
console.log(cars.length);
console.log(cars.sort());
console.log(cars);
console.log(cars[cars.length-1]);

const fruits = ["Banana", "Orange", "Apple"];
fruits[6] = "Lemon";
console.log(fruits);
console.log(fruits.toString());
console.log(cars.join(" "));
cars.push("TOYATA");
console.log(cars);
cars.pop();
console.log(cars.pop("BMW"));
console.log(cars);

const fruit = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
const citrus = fruit.slice(1);
console.log(fruit);

