document.getElementById("myForm").addEventListener('submit' , function(event){
event.preventDefault();
let userName = document.getElementById('username').value;
let userAge = document.getElementById('age').value;
console.log(userName);
console.log(userAge);
alert('Form submitter! ' + userName);
});