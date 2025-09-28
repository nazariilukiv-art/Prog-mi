a = int(input("Introduce primer numero: "))
b = int(input("Introduce segundo numero: "))

while b != 0:
    resto = a % b
    a = b           
    b = resto
print("El máximo común divisor es:", a)