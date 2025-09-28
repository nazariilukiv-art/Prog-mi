import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.random.Random

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))

    // Leemos el número secreto enviado por el padre
    val numeroSecreto = input.readLine().toInt()
    println("Hijo recibio el numero secreto ($numeroSecreto)")

    var adivinado = false
    while (!adivinado) {
        val intento = Random.nextInt(1, 100) // 🔹 Números entre 1 y 10
        if (intento == numeroSecreto) {
            println("Numero: $intento")
            println("OK")
            adivinado = true
        } else {
            println("Numero: $intento")
            println("NO")
        }
    }
}
