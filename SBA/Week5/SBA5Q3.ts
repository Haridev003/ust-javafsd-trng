class Employee{
    Name:string;
    Emp_no:number[]=[];
    constructor(Name:string,Empno:number){
        this.Emp_no[0]=Empno;
         this.Name=Name;
    }
    display():void{
    console.log(this.Name);
    console.log(this.Emp_no[0]);
    }
}
let  obj = new Employee("hari",1234567);
obj.display();




