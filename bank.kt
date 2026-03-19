import java.util.Scanner

fun main(args: Array<String>) {
    println("Bankga qo'yiladigan so'mmani kiring")
    var scanner = Scanner(System.`in`)
    print("USZ=")
    var usz = scanner.nextInt()
    var d = 2 * usz
    var j = 0
    var sum=0.0
while (sum<= d) {
    sum+=(usz*15.0)/100
    j++
}
    println("Kiritigan summa $j oyda $sum bo'ldi")
}