fun main (){
    val num1 = readLine()?.toFloat()!!
    val znak = readLine()!!
    val num2 = readLine()!!.toInt()
    println(calculate(num1, num2, znak))
}
fun calculate (first_number:Float, second_number:Int, pes_patron:String) :String {
    var response: String = ""
    when (pes_patron) {
        "-" -> {
            response = (first_number - second_number).toString()
        }
        "+" -> {
            response = (first_number + second_number).toString()
        }
        "*" -> {
            response = (first_number * second_number).toString()
        }
        "/" -> {
            response = (first_number / second_number).toString()
        }
        else -> "Неправильно"
    }
    return response
}
//fun main(){
//    var maxNumber =Int.MIN_VALUE
//    var input: String
//    do{
//        input = readLine()?:""
//        val number =  input.toIntOrNull()
//        number?.plus(number)
//        if (number != null && number > maxNumber)
//            maxNumber = number
//    }while(input !="стоп")
//
//    println("$maxNumber")
//}