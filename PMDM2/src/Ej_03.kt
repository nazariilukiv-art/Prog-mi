fun main() {
    print("Introduce un número: ")
    val numero = readLine()!!.toInt()

    if (esPrimo(numero)) {
        println("El número $numero es primo")
    } else {
        println("El número $numero no es primo")
    }
}

fun esPrimo(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true

    if (n % 2 == 0 || n % 3 == 0) return false

    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
    }

    return true
}