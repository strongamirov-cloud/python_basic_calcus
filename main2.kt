import java.util.Scanner

fun main(args: Array<String>) {
    println("Matinni kiriting")
    var scanner = Scanner(System.`in`)
    print("Ma'lumotni kiriting=")
    var m=scanner.next()
    var j=0

    for (i in 0..m.length){
        while(j<=i){
            for (n in 0..j)
            print(m[j])
            j++
        }

    }

}