fun main() {
    var userName: String = "Shashwat"
    var age: Int? = null
    /// type inference is process by which the type of variable
    /// can be deducted by the value assigned
    var number = 33
    println("Hello $userName! your age is $age")

//    byteIntLong()
//    floatingType()
//    charactersAndBoolean()
    whenStatement()
}

fun byteIntLong() {

    val myNumber = 28L  // to convert into Long


    val myMaxLongValue: Long = Long.MAX_VALUE;
    val myMinLongValue: Long = Long.MIN_VALUE;
    println("Long max value: $myMaxLongValue") //9223372036854775807
    println("Long min value: $myMinLongValue") //-9223372036854775808

    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int = Int.MIN_VALUE
    println("Int max value: $maxIntegerValue") //2147483647
    println("Int min value: $minIntegerValue") //-2147483648


    val myMaxShortValue: Short = Short.MAX_VALUE;
    val myMinShortValue: Short = Short.MIN_VALUE;
    println("Short max value: $myMaxShortValue") //32767
    println("Short min value: $myMinShortValue") //-32768

    val myMaxByteValue: Byte = Byte.MAX_VALUE;
    val myMinByteValue: Byte = Byte.MIN_VALUE;
    println("Byte max value: $myMaxByteValue") //127
    println("Byte min value: $myMinByteValue") //-128

}

fun floatingType() {
    val myNumber = 2.5f   // to convert double to float
    val myDoubleNumber = 2.5
    print("myNumber=$myNumber and myDoubleNumber=$myDoubleNumber")
}

fun charactersAndBoolean() {
    val myCharValue: Char = 'D'
    val myBoolean: Boolean = false
    println("myCharValue :$myCharValue \nmyBoolean:$myBoolean")
}


/** when statement work same as [switch]
in java and other languages
but with greater customization,
and it doesn't need return or break
statement
 */
fun whenStatement() {
    val alarm = 12
    when (alarm) {
        12, 13 -> println("this time is $alarm")  // it check if alarm is 12 or 13
        in 1..11 -> println("time is in range")  // to check in range
        7 -> println("this time is $alarm")
        14 -> println("this time is $alarm")
        else -> println("this time is $alarm")

    }
    /** if we don't give argument bracket in
     when statement it executes as series of
     if else commands
     it breaks after it gets it's
     first correct expression
      */
    when  {
        5<12 -> println("this time is $alarm")  // it check if alarm is 12 or 13
        7>12 -> println("hello there")
        7<12 -> println("hello there 2")

        else -> println("this time is $alarm")
    }


}

fun nullOperater()
{
    var text:String?=null;
    val text2=text?: "kdskmdfs"  /** [?:] work as [??] in dart */
    println(text!!.length)         /** [!!] work as if it not null do the operation else throw the exception*/

}