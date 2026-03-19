import java.util.Scanner

fun main(args: Array<String>) {
    println("Ikkta natural sonlarni kiriting")
    var scanner = Scanner(System.`in`)
    print("Birinchi sonni kiring=")
    var ai = scanner.nextInt()
    print("ikkinchi sonni kiring=")
    var ki = scanner.nextInt()
    for (ai in ai ..ki){
      var j=ai
        for (m in 1..ai){
            print("$j")

        }
    }



}
