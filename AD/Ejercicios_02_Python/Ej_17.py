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

print("Número de combinaciones:", combinaciones)
