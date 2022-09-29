class Student {   
       constructor(name, age) {   
          this.n = name;   
          this.a = age;  
       }   
       stu() {   
          console.log("The Name of the student is: ", this.n)   
          console.log("The Age of the student is: ",this. a)   
       }   
    }   
      
    var stuObj = new Student('Peter',20);   
    stuObj.stu();  