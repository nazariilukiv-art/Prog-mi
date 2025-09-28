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
        break