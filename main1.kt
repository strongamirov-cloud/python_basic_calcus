import java.util.Scanner

fun main(args: Array<String>) {

    println("Sonni kiriting")
    var scanner = Scanner(System.`in`)
    print("Natural son kiriting=")
    var b: Double=0.0
    var i=0
    var n=scanner.nextInt()
   for (i in 1..n){
       b+=1.0/i
       if (i==n){
           println("$b")
       }
   }
}