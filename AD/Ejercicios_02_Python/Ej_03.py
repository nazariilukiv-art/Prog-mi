for numero in range(2, 51):
    es_Primo = True
    for i in range(2, numero):
        if numero % i == 0:
            es_Primo = False
            break
    if es_Primo:
        print(numero, "es primo")