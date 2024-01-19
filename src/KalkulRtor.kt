fun main (){
    var x = readLine()?.toDoubleOrNull()!!
    var b = readLine()!!
    var y = readLine()!!.toDouble()
    when (b) {
        "+" -> {var r = x + y
            println("$x + $y = ${x+y}")
        }
        "-" ->  println("$x - $y = ${x-y}")
        "*" ->  println("$x * $y = ${x*y}")
        "/" ->  println("$x / $y = ${x/y}")
        else -> println("Ошибка")
    }
}