cantidad = int(input("¿Cuántos números quieres introducir? "))
suma = 0
for i in range(cantidad):
    n = float(input("Introduce un número: "))
    suma += n

promedio = suma / cantidad
print("El promedio de los números es:", promedio)
    