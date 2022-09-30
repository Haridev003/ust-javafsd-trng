interface IPerson{
    firstname:string;
    lastname:string;
    sayHi:()=>string;
}
var customer : IPerson={
    firstname:"tom",
    lastname:"Hanks",
    sayHi:():string=>{return "hi there"}
}
console.log("Coustmer Object");
console.log(customer.firstname);
console.log(customer.lastname);
console.log(customer.sayHi());
var employee:IPerson={
    firstname:"jim",
    lastname:"Blakes",
     sayHi:():string=>{return "hello!!1"}
}
console.log("Employee Object");
console.log(employee.firstname);
console.log(employee.lastname);
console.log(employee.sayHi());
