import 'colors'
import Carro from './Carro.interface';
import { SuperHero } from './SuperHero.class';

/*
let salute: string = 'Hola, what if I die?';
console.log(salute.america); //Never use var because it does not overwrite
// var nombre = 3;
// for(let i = 0; i < 10; i++){
//     var nombre = 30;
// }
// console.log(nombre);
let nombre: string = 'Jun'
console.log(`Me llamo ${nombre}`.bgCyan);

let pais: string;
let numero: number;
let booleano: boolean;
let hoy: Date;
let cualquiera:any;*/

let r4: Carro = {
    brand: 'Reunault',
    model: 'Renault 4 Master',
    year: 1974,
    color: 'red',
    price: 1300
}

const {brand,model} = r4;       //Destructuración de objetos

console.log(brand,model);

r4.brand = 'Toyota';
console.log(r4);

r4={
    ...r4,  //Spread operator
    price:100
}

let superman:SuperHero = new SuperHero('Clark Kent', 'Fuerza', 'Superman', 35, 'Metropolis');
console.log(superman);
superman.Name="Juan";
console.log(superman);
console.log(superman.Name);