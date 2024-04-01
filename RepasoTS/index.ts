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
numeros.map(numero=>numero*2).sort((a,b)=> a-b).forEach(numero=>console.log(numero)); //Se multiplican todos los números por dos y se imprimen

let carros:Carro[]=[{
    brand:"Renault",
    model:"Renault 4 Master",
    year:1974,
    color:"red",
    price:1500
},
{
    brand:"Ford",
    model:"Ford Mustang",
    year:1974,
    color:"red",
    price:40000
},{
    brand:"BMW",
    model:"BMW M3",
    year:2024,
    color:"red",
    price:25000
}];

carros.sort((a, b)=> a.price-b.price).forEach(carro=>console.log(carro));       //Organiza carro de mayor a menor
console.log("-------------")
carros.filter(carro=>carro.year>=2000).forEach(carro=>console.log(carro));      //Sólo los carros de año mayor o igual a 2000
console.log("-------------")
carros.forEach(carro=>console.log(carro));                                      //Imprime todos los carros mostrando que no se editó la lista
let busqueda = carros.find(carro=>carro.brand=="Renault");                     //Encuentra el carro con la marca Renault
console.log("El carro buscado es ", busqueda);