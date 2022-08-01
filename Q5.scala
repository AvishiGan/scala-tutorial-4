object Q5 extends App{
// string input -> upper case
def toUpper(str: String): String = {
  str.toUpperCase()
}

// string input -> lower case
def toLower(str: String): String = {
  str.toLowerCase()
}

// parameter group
def formatNames(name: String)(function: String => String): String = {
  function(name)
}

println(formatNames("Benny")(toUpper(_)))
println(formatNames("Ni")(toUpper(_)) + "roshan")
println(formatNames("Saman")(toLower(_)))
println("Kumar" + formatNames("a")(toUpper(_)))


// Output:
// BENNY
// NIroshan
// saman
// KumarA
}