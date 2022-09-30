class Car{
    engine : string;
    constructor(engine:string){
        this.engine=engine;

    }
    disp():void{
        console.log("Function displays engine is:"+this.engine);

    }
}
var obj=new Car("XXSY1");
console.log("Reading attribute value Engine as:"+obj.engine);
