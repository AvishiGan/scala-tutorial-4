object Q4 extends App{

def function(args: Array[String]) = {
    val input: Int = args(0).toInt
    input match {
        case 1 if input == 0 => println("Negative/Zero is input")
        case 2 if input % 2 == 0 => println("Even number is given")
        case 3 if input % 2 != 0 => println("Odd number is given")
    }
}
}

// Write a program in PatternMatching, takes the integer input from the command line. Based
// on the input, write a code using match to print Negative/Zero is input when input is less than or
// equal to 0.Print Even number is given when input is even, and print Odd number is given when
// input is odd.