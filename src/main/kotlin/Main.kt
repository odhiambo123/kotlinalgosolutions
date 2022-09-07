fun main(args: Array<String>) {
   val  a : String = "#"
    for(i in 1..6){
        println(a.repeat(i))

        }
    for (j in 6 downTo 1){
        println(a.repeat(j))

    }
/*val n : Int = 6
    for (i in 1..n){
        for (j in 1..i){
            print("#")
        }
        println()
    }
    for (i in n-1 downTo 1){
        for (j in 1..i){
            print("#")
        }
        println()
    }*/
    println("Program arguments: ${args.joinToString()}")
}