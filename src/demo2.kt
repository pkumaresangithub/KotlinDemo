fun main (args:Array<String>)
{
 var num1 = 10
 var num2 = 3
 var sum = Array<Double>(10){0.0}
    var sub = Array<Double>(10){0.0}
    var div = Array<Double>(10){0.0}
    var  mul = Array<Double>(10){0.0}
    var count1=0

    var result =0.1
    println("Enter Number 1 value")
    num1 = Integer.valueOf(readLine())
    println("Enter Number 2 value")
    num2 = Integer.valueOf(readLine())

    do {

        result = (num1.toFloat() / num2.toFloat()).toDouble()
    print("Divide is " )
    println(result)
        div[count1]=result
    result = (num1 * num2).toDouble()
    print("Multiplay is " )
    println(result)
        mul[count1]=result
        result = (num1 + num2).toDouble()
    print("addition is " )
    println(result)
        sum[count1]=result
    result = (num1 - num2).toDouble()
    print("substraction is " )
    println(result)
        sub[count1]=result
        num1 -= 1
        count1 += 1
        println()
        println()

    } while (num1 >= 5)

    printarry(sum, sub, mul, div)


}

fun printarry(sum: Array<Double>, sub: Array<Double>, mul: Array<Double>, div: Array<Double>) {

    println(" Sum array")
    for (i in sum)
        println(i)
    println(" Sub array")
    for (i in sub)
        println(i)
    println(" Mul array")
    for (i in mul)
        println(i)
    println(" Div array")
    for (i in div)
        println(i)
}

