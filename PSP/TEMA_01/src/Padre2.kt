import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    var numeroSecreto: Int

    // Pedimos numero hasta que este en el rango correcto
    do {
        print("Introduce un número secreto (entre 1 y 100): ")
        numeroSecreto = scanner.nextInt()
        if (numeroSecreto !in 1..99) {
            println("el número debe estar entre 1 y 100")
        }
    } while (numeroSecreto !in 1..99)

    // Ejecutamos el hijo
    val proceso = ProcessBuilder(
        "java", "-cp",
        "E:\\DAW_2\\Git\\PSP\\out\\production\\Tema_01;" +
                "C:\\Users\\Nazar\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib\\2.2.0\\kotlin-stdlib-2.2.0.jar;" +
                "C:\\Users\\Nazar\\.m2\\repository\\org\\jetbrains\\annotations\\13.0\\annotations-13.0.jar",
        "Hijo2Kt"
    ).start()

    // Enviamos el número al hijo
    val out = OutputStreamWriter(proceso.outputStream)
    out.write("$numeroSecreto\n")
    out.flush()

    // Leemos la respuesta del hijo
    val input = BufferedReader(InputStreamReader(proceso.inputStream))
    var respuesta: String?

    do {
        respuesta = input.readLine()
        println("Padre recibió: $respuesta")
    } while (respuesta != null && respuesta != "OK")
}
