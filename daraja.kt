import java.util.Scanner

fun main(args: Array<String>) {
    println("Natural son va darajani kiriting")
    var sc = Scanner(System.`in`)
    print("Natural son=")
    var n = sc.nextInt()
    print("Daraja=")
    var d = sc.nextInt()
     for (i in 1..d){
         println( "$n  sonning  $i    darajasi ${Math.pow(n.toDouble(), i.toDouble())} ga teng  ")

     }
}