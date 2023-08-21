fun sayHello() {
    var response = returnMax(1, 2)
    var res = returnMax(b = 3, a = 4)
    println("trying new file $response")
}

// normal function
fun returnMax(a: Int, b: Int, c: Int = 5): Int {
    return if (a > b) a else b
}

// one line function
fun sendText() = "Some text"

// vararg function

fun varargFunction(vararg  numbers: Int):Int {
    var response=0
    for(number in numbers) {
        response +=  number
    }
    numbers.forEach { println(it) }
    return response;
}