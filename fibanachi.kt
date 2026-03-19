import java.util.Scanner

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    print("n=")
    var n = scanner.nextInt()
    var f1=1
    var f2=1
    var f3=2
    var sum=0
    for (i in 1..n){
        var a=f1
        sum=f1+f2
        f1=f2
f2=sum
        if (n<f1){
            println("Bu son fibanachi emas")
            break
        }else if (n<=f1){
            println("Bu son fibanachi ")
            break
        }
    }
}