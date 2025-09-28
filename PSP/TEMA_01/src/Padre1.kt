import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val proceso = ProcessBuilder("C:\\Program Files\\Java\\jdk-21\\bin\\java.exe\" \"-javaagent:C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2025.2.1\\lib\\idea_rt.jar=58738\" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath E:\\DAW_2\\Git\\PSP\\out\\production\\Tema_01;C:\\Users\\Nazar\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib\\2.2.0\\kotlin-stdlib-2.2.0.jar;C:\\Users\\Nazar\\.m2\\repository\\org\\jetbrains\\annotations\\13.0\\annotations-13.0.jar Hijo1Kt")
    val procesoArancado = proceso.start()

    val array = arrayOf("hola","desde","proceso","padre")

    val out = OutputStreamWriter(procesoArancado.outputStream)

    out.write(array.joinToString(",")+"\n")

    out.flush()


    val input = procesoArancado.inputStream
    val leer = BufferedReader(InputStreamReader(input))
    print(leer.readLine())
    //print(array.joinToString(","))
}