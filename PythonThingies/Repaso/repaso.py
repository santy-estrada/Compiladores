edad:int = 3
nombre:str = "juan"
print(f"El numero es {edad}")
print(nombre*3)

"""
comment multilinea
"""
print("--------------------")
j = 10
k = 3
l = j//k
l = l*k
print(l)
print("--------------------")

mensaje:str = "Hola soy un mensaje muy aburrido"
print(mensaje[:5])
print(mensaje[5:])
print(mensaje[::2])              #Imprime de 2 en 2
print("--------------------")

if (k==10):
   print("Helado") 
elif (k==3):
    print("No helado")
else:
    print("yey")
    
print("--------------------")

while(k<=5):
    print(k**2, "carro" + " cassa")
    k+=1
    
print("--------------------")
for i in range(0,10,1):
    print(i, end=" ")

print()    
n = int(input("Deme un número"))
suma = 0
for i in range (1,n+1,1):
    suma += i
    
print(suma)
print(n*(n+1)/2)    #Fórmula de Gauss
print("--------------------")

lista:list[int] =[4,5,6,7,5,2,6]
listax2 = [i*2 for i in lista]
print(listax2)

lista.append(3)
lista.pop()
print(lista)

tupla = (3,2,1,4)
ltp = list(tupla)
print(type(ltp))

#Dadas 2 listas hacer unión e intersección
lista1 = set([13,69,71,14,250])
lista2 = set([8,7,5,14,71,13])

print(f"Unión {lista1|lista2}")
print(f"Intersección {lista1 & lista2}")
print("--------------------")

def nombre(*param) -> int:     #Con * se indica que se pasa una lista de parámetros
    suma = 0
    for i in param:
        suma +=i
    return suma

print(nombre(1,5,3))