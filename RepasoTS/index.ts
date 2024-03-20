import Carro from "./Carro.interface";

let numeros:number[]=[1,2,3,4,5];
numeros.push(6);            //Añade al final    
numeros.unshift(0);         //Añade al principio
console.log(numeros);

numeros.pop();              //Obtiene y elimina el ultimo elemento
numeros.shift();            //Obtiene y elimina el primer elemento

console.log(numeros);

numeros.splice(2,1);        //Eliminar elemento en posición 2
console.log(numeros);
numeros =[-1,...numeros, 45]
console.log(numeros);