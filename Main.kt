fun main(){

    println("sum1: ${sum1(22,23)}")
    val sum2 = fun(a: Int, b: Int): Int = a+b
    println("sum2: ${sum1(22,23)}")

    val greet: () -> Unit = fun() =  println("hello world!")
    greet.invoke()
    greet()

    val sumOf2Numbers: (Int, Int) -> Int = fun(a: Int, b: Int) = a+b
    println(sumOf2Numbers.invoke(12,13))
    println(sumOf2Numbers(13,14))

    val printWordTimes = {word: String, number: Int ->
        for(numb in 1..number){
            print("$word, ")
        }
    }
    printWordTimes("save", 4)
    println()
    printWordTimes("something", 7)
    println()
}

fun sum1(a: Int, b: Int): Int = a+b


/*
*  functions that returns boolean -> (T) -> boolean, are often named PREDICATE
*  functions that transform one value to another -> (T) -> P, are often called TRANSFORMATION
*  functions that return Unit, (T) -> Unit, are often called OPERATION
*/

// function type offers 1 method -> invoke

