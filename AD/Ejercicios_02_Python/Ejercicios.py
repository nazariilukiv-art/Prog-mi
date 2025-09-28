"""suma = 0
for numero in range(1, 11):
    suma += numero
print("La suma es:", suma)"""


"""
numero = int(input("Ingrese un numero: "))
factorial = 1
for i in range(1, numero+1):
    factorial *= i
print("El factorial de", numero, "es:", factorial)
 """
 
 
""" for numero in range(2, 51):
    es_Primo = True
    for i in range(2, numero):
        if numero % i == 0:
            es_Primo = False
            break
    if es_Primo:
        print(numero, "es primo")"""
        
"""
numero = input("Introduce un numero entero: ")
suma = 0
for digito in numero:
    suma += int(digito)
print("La suma de los digitos es:", suma)"""


"""suma = 0
for i in range(1, 101):
    if i % 2 == 0:
        suma += i
print("La suma de los numeros pares del 1 al 100 es:", suma)
"""

"""base = float(input("Introduce la base del triángulo: "))
altura = float(input("Introduce la altura del triángulo: "))
area = (base * altura) / 2
print("El área del triángulo es:", round(area, 2))"""


"""
for num in range(1, 101):
    if num % 3 == 0:
        print("Fizz")
    elif num % 5 == 0:
        print("Buzz")
    else:
        print(num)"""
        
"""        
import random
numero_Aleatorio = random.randint(1, 100)

while True:
    intento = int(input("Adivina el número entre 1 y 100: "))
    if intento < numero_Aleatorio:
        print("El numero es mayor")
    elif intento > numero_Aleatorio:
        print("El numero es menor")
    else:
        print("Has adivinado el número!")
        break"""
        
"""        
cantidad = int(input("¿Cuántos números quieres introducir? "))
suma = 0
for i in range(cantidad):
    n = float(input("Introduce un número: "))
    suma += n

promedio = suma / cantidad
print("El promedio de los números es:", promedio)
    """
    
    
"""    
texto = input("Introduce un texto: ")
vocales = "aeiouAEIOU"
contador = 0
for letra in texto:
    if letra in vocales:
        contador += 1
print("La cantidad de vocales en el texto es:", contador)"""


"""palabra = input("Introduce una palabra: ")
reversa = ""
for letra in palabra:
    reversa = letra + reversa
if palabra == reversa:
    print("La palabra es un palíndromo")
else:
    print("La palabra no es un palíndromo")"""
    
    

"""radio = float(input("Introduce el radio del circulo: "))
pi = 3.1416
area = pi * (radio ** 2)
print("El area del circulo es:", round(area, 2))"""


"""n = int(input("Introduce un numero: "))
for i in range(1, 11):
    print(i, "x", n, "=", i * n)"""
    
"""
suma = 0
for i in range(1, 101):
    if i % 2 != 0:
        suma += i
print("La suma de los numeros impares del 1 al 100 es:", suma)"""


"""texto = input("Introduce un texto: ")
letra = input("Introduce una letra: ")
contador = 0    
for character in texto:
    if character == letra:
        contador += 1
print("La letra", letra, "aparece", contador, "veces en el texto.")"""


"""a = int(input("Introduce primer numero: "))
b = int(input("Introduce segundo numero: "))

while b != 0:
    resto = a % b
    a = b           
    b = resto
print("El máximo común divisor es:", a)"""

"""
n = int(input("Introduce n: "))
k = int(input("Introduce k: "))

fact_n = 1
for i in range(1, n+1):
    fact_n = fact_n * i

fact_k = 1
for i in range(1, k+1):
    fact_k = fact_k * i

fact_nk = 1
for i in range(1, n-k+1):
    fact_nk = fact_nk * i

combinaciones = fact_n // (fact_k * fact_nk)

print("Número de combinaciones:", combinaciones)"""



"""
import random

while True:
    print("Elige tu opcion:")
    print("1 - Piedra")
    print("2 - Papel")
    print("3 - Tijeras")
    print("0 - Salir")
    jugador_num = int(input("Introduce un numero (0-3): "))

    if jugador_num == 0:
        print("Saliendo del juego...")
        break

    if jugador_num < 0 or jugador_num > 3:
        print("Opcion no valida. Intenta de nuevo.")
        continue

    computadora_num = random.randint(1, 3)

    if jugador_num == 1:
        print("Has elegido: Piedra")
    elif jugador_num == 2:
        print("Has elegido: Papel")
    elif jugador_num == 3:
        print("Has elegido: Tijeras")

    if computadora_num == 1:
        print("La computadora ha elegido: Piedra")
    elif computadora_num == 2:
        print("La computadora ha elegido: Papel")
    elif computadora_num == 3:
        print("La computadora ha elegido: Tijeras")

    if jugador_num == computadora_num:
        print("Empate")
    elif (jugador_num == 1 and computadora_num == 3) or \
         (jugador_num == 2 and computadora_num == 1) or \
         (jugador_num == 3 and computadora_num == 2):
        print("Ganaste")
    else:
        print("Perdiste")

    print()"""



"""Ejercicios de introducion"""


"""suma = 0
for numero in range(1, 11):
    suma += numero
print("La suma es:", suma)"""


"""numero = int(input("Ingrese un numero: "))
factorial = 1
for i in range(1, numero+1):
    factorial *= i
print("El factorial de", numero, "es:", factorial)

"""



"""suma = 0
for i in range(1, 101):
    if i % 2 == 0:
        suma += i
print("La suma de los numeros pares del 1 al 100 es:", suma)"""


"""base = float(input("Introduce la base del triángulo: "))
altura = float(input("Introduce la altura del triángulo: "))
area = (base * altura) / 2
print("El área del triángulo es:", round(area, 2))
"""


"""for num in range(1, 101):
    if num % 3 == 0:
        print("Triplete")
    elif num % 5 == 0:
        print("Cinquillo")
    else:
        print(num)"""
        
        
"""import random
numero_Aleatorio = random.randint(1, 100)

while True:
    intento = int(input("Adivina el número entre 1 y 100: "))
    if intento < numero_Aleatorio:
        print("El numero es mayor")
    elif intento > numero_Aleatorio:
        print("El numero es menor")
    else:
        print("Has adivinado el número!")
        break
        """
        
"""radio = float(input("Introduce el radio del circulo: "))
pi = 3.1416
area = pi * (radio ** 2)
print("El area del circulo es:", round(area, 2))"""


"""n = int(input("Introduce un numero: "))
for i in range(1, 11):
    print(i, "x", n, "=", i * n)"""
"""    
suma = 0
for i in range(1, 101):
    if i % 2 != 0:
        suma += i
print("La suma de los numeros impares del 1 al 100 es:", suma)"""

"""
texto = input("Introduce un texto: ")
letra = input("Introduce una letra: ")
contador = 0    
for character in texto:
    if character == letra:
        contador += 1
print("La letra", letra, "aparece", contador, "veces en el texto.")"""