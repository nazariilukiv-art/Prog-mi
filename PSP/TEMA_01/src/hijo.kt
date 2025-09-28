import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main(){
    val input = BufferedReader(InputStreamReader(System.`in`))
    val output = OutputStreamWriter(System.out)


    // output.write("Introduce numero: ")
    // output.flush()

    output.write(input.readLine().uppercase())
    output.flush()


}