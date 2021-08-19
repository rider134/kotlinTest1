fun main(args: Array<String>) {

    //endless loop just for quick testing
    while(true){
        println("Enter numbers:")
        var console = readLine()
        println(charToNumber(console.toString()))
    }

}

//map to change the numbers format
val numbersMap = mapOf( "one" to 1,
                        "two" to 2,
                        "three" to 3,
                        "four" to 4,
                        "five" to 5,
                        "six" to 6,
                        "seven" to 7,
                        "eight" to 8,
                        "nine" to 9,
                        "zero" to 0)

////////////////////////////////////////////////////////////////////////////
// takes a "-" separated list of written numbers,
// transforms the number representation and calculates the sum
// if the input is not valid an empty string will be returned
fun charToNumber(input: String) : String {

    val numbers = input.lowercase().split("-")

    //check if all numbers are valid and transform the string
    if(numbers.all { numbersMap.containsKey(it) } ) {
        val list = numbers.map{ numbersMap[it]!! }
        return list.joinToString("+", "", "=") + list.sum().toString()
    }

    //if string is not valid return empty
    return ""
}