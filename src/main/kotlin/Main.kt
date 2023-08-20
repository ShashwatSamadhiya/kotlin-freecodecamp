fun main() {
    var userName:String="Shashwat"
    var age:Int?=null
    /// type inference is process by which the type of variable
    /// can be deducted by the value assigned
    var number=33
    println("Hello $userName! your age is $age")

//    byteIntLong()
//    floatingType()
    charactersAndBoolean()
}

fun byteIntLong(){

    val myNumber=28L  // to convert into Long


    val myMaxLongValue:Long= Long.MAX_VALUE;
    val myMinLongValue:Long= Long.MIN_VALUE;
    println("Long max value: $myMaxLongValue") //9223372036854775807
    println("Long min value: $myMinLongValue") //-9223372036854775808

    val maxIntegerValue:Int = Int.MAX_VALUE
    val minIntegerValue:Int = Int.MIN_VALUE
    println("Int max value: $maxIntegerValue") //2147483647
    println("Int min value: $minIntegerValue") //-2147483648


    val myMaxShortValue:Short= Short.MAX_VALUE;
    val myMinShortValue:Short= Short.MIN_VALUE;
    println("Short max value: $myMaxShortValue") //32767
    println("Short min value: $myMinShortValue") //-32768

    val myMaxByteValue:Byte= Byte.MAX_VALUE;
    val myMinByteValue:Byte= Byte.MIN_VALUE;
    println("Byte max value: $myMaxByteValue") //127
    println("Byte min value: $myMinByteValue") //-128

}

fun floatingType(){
     val myNumber=2.5f   // to convert double to float
     val myDoubleNumber=2.5
     print("myNumber=$myNumber and myDoubleNumber=$myDoubleNumber")
}

fun charactersAndBoolean(){
    val myCharValue:Char='D'
    val myBoolean:Boolean=false
    println("myCharValue :$myCharValue \nmyBoolean:$myBoolean")
}