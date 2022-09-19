import com.davidodhiambo.kotlinalgosolutions.fibonacci
import com.davidodhiambo.kotlinalgosolutions.printFibonacci
import com.davidodhiambo.kotlinalgosolutions.towerOfHanoi

fun main(args: Array<String>) {
    val border = "============================================================="
    printFibonacci(10)
    println( border)
    towerOfHanoi(5, "A", "B", "C")
    //number of moves = 2^n - 1
    println( border)



}