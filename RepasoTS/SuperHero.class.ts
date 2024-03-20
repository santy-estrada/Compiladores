export class SuperHero{
    private name: string;
    private power: string;
    private alterEgo: string;
    private age: number;
    private city: string;

    constructor(name: string, power: string, alterEgo: string, age: number, city: string){
        this.name = name;
        this.power = power;
        this.alterEgo = alterEgo;
        this.age = age;
        this.city = city;
    }

    public get Name(): string{
        return this.name;
    }
    
    public set Name(name: string){
        this.name = name;
    }

}