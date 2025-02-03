// Objectives:
// ✅ Understand Kotlin variables (var, val) and data types
// ✅ Learn how to write functions and call them
// ✅ Work with conditionals (if-else, when)
// ✅ Use loops (for, while) to iterate over data

// Exercise:
// ✅ Declares two variables (one val and one var)
// ✅ Defines a function that takes two numbers and returns their sum
// ✅ Uses an if-else statement to check if a number is even or odd
// ✅ Iterates over a list of numbers using a for loop

// 💡 Bonus: Modify the program to take user input and display the results.



// 1.  Understand Kotlin variables (var, val) and data types
// Kotlin uses two different keywords to declare variables: val and var . val is used for a variable whose value never changes. You can't reassign a value to a variable that was declared using val . var is used for a variable whose value can change.

// ✅ Declares two variables (one val and one var)
val myName= "Mabel"
var todayDate= "03/02/2025"

println(myName + ", " + todayDate)

// Data types are divided into different groups:

// Numbers
// Numbers can either be integer point types or floatting point types.
// Integer types can either be 
// a) byte  whole numbers from -128 to 127
// b) short whole numbers from -32768 to 32767
// c)int numbers from -2147483648 to 2147483647
// d) long numbers from -9223372036854775808 to 9223372036854775807.

// floating point types can either be float or double
// *** The precision of Float is only six or seven decimal digits, while Double variables have a precision of about 15 digits. Therefore it is safer to use Double for most calculations. you should also end the value of a Float type with an "F".


// Characters
// Booleans
// Strings
// Arrays


// 2. Learn how to write functions and call them
// ✅ Defines a function that takes two numbers and returns their sum
fun addition(x: Int, y: Int) = x + y

fun main() {
  var result = addition(10, 4)
  println(result)
}



// ✅ Uses an if-else statement to check if a number is even or odd
fun oddOrEven(x: Int) {
    if (x % 2 == 0) {
        println("The number $x is even")
    } else {
        println("The number $x is odd")
    }
}

fun main() {
    oddOrEven(13) 
}


// ✅ Iterates over a list of numbers using a for loop
val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
for (x in cars) {
  println(x)
}