class BasketPlayer:
    #Constructor
    def __init__(self, name, height, age) -> None:
        self.name = name
        self.height = height
        self.age = age
        
    def __eq__(self, __name, __height,__age: object) -> bool:
        pass
    
    def __str__(self) -> str:
        return f"{self.name} {self.height}"
    
class PressionalBP(BasketPlayer):
    def __init__(self, name, height, age, costo) -> None:
        super().__init__(name, height, age)
        self.costo = costo
        
    def __str__(self) -> str:
        return super().__str__() + self.costo
    
"""
Crear una clase persona y encontrar el imc
Decir si es delgada, normal, sobre peso u obeso
"""

class persona:
    def __init__(self, peso:float, nombre:str, altura:float) -> None:
        self.peso = peso
        self.nombre = nombre
        self.altura = altura
        
    def imc(self) -> str:
        imc = self.peso/self.altura**2
        
        if(imc < 17):
            return "Bajo"
        elif(imc > 17 and imc < 25):
            return "Normal"
        elif(imc > 25 and imc < 30):
            return "Sobrepeso"
        else:
            return "La mala"
        
p = persona(77,"Juan", 1.75)

print(p.imc())