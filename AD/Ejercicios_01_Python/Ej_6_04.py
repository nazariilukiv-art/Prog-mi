peso = float(input("Ingrese su peso en kilogramos: "))
altura = float (input("Ingrese su altura en metros: "))
imc = int(peso / (altura ** 2))
print(f"Su índice de masa corporal IMC es: {imc}")