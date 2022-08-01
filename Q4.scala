object Q4{
// Main Method
// XX args: Array[String] -> access command line arguments
// FOR JAVA - public void main(String args[])
def main(args: Array[String]) = {
    print("Enter an Integer: ")
    val input:Int = scala.io.StdIn.readInt()
    input match {
        case x if x <= 0 => println("Negative/Zero is input")
        case x if x % 2 == 0 => println("Even number is given")
        case x if x % 2 != 0 => println("Odd number is given")
    }
}
}

