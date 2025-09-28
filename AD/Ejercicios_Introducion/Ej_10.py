texto = input("Introduce un texto: ")
letra = input("Introduce una letra: ")
contador = 0    
for character in texto:
    if character == letra:
        contador += 1
print("La letra", letra, "aparece", contador, "veces en el texto.")