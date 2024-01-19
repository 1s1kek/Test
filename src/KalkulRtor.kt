fun main (){
    var x = readLine()?.toDoubleOrNull()!!
    var b = readLine()!!
    var y = readLine()!!.toDouble()
    if  (b == "+") {
        var a = x + y
        println(a)
    }
    else if (b == "-"){
        var a = x - y
        println(a)
    }
    else if (b == "*"){
        var a = x * y
        println(a)
    }
    else if (b == "/"){
        var a = x / y
        println(a)
    }
}