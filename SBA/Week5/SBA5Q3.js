var Employee = /** @class */ (function () {
    function Employee() {
        this.Emp_no = [];
    }
    return Employee;
}());
var obj = new Employee();
obj.Name = "hari";
obj.Emp_no[0] = 1234567;
console.log(obj.Name);
console.log(obj.Emp_no[0]);
