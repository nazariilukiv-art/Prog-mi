palabra = input("Introduce una palabra: ")
reversa = ""
for letra in palabra:
    reversa = letra + reversa
if palabra == reversa:
    print("La palabra es un palíndromo")
else:
    print("La palabra no es un palíndromo")