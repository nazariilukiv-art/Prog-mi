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

    print()