#Hecho por chat GPT

dato = input("Ingresa un valor: ")

# Intentamos convertir a entero
try:
    dato = int(dato)
except ValueError:
    # Si no es entero, intentamos convertir a float
    try:
        dato = float(dato)
    except ValueError:
        # Si no es número, queda como string
        pass

print("El tipo de dato ingresado es:", type(dato))