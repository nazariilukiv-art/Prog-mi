import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){

    val proceso = ProcessBuilder("C:\\Program Files\\Java\\jdk-21\\bin\\java.exe\" \"-javaagent:C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2025.2.1\\lib\\idea_rt.jar=60892\" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath E:\\DAW_2\\Git\\PSP\\out\\production\\Tema_01;C:\\Users\\Nazar\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib\\2.2.0\\kotlin-stdlib-2.2.0.jar;C:\\Users\\Nazar\\.m2\\repository\\org\\jetbrains\\annotations\\13.0\\annotations-13.0.jar HijoKt")
    val procesoEjecutado = proceso.start()

    val output = OutputStreamWriter(procesoEjecutado.outputStream)
    output.write("hola hijo felicidades\n")
    output.flush()

    val input = BufferedReader(InputStreamReader(procesoEjecutado.inputStream)).readLine()
    println(input)

}