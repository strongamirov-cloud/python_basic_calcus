import java.util.*
import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.pow

fun main(args: Array<String>) {
    println("Kub ildiz chiqarish kerak bo'lgan sonni kiriting")
    var kiritish = Scanner(System.`in`)
    print("son=")
    var son=kiritish.nextDouble()
    var b=son
    var c=1.0/3
    var a=Math.pow(b.toDouble(),c.toDouble())
    println(Math.ceil(a))
    //Ikkinchi usul
    println("Ikkinchi usul")
    println(Math.cbrt(b))

}