class User(name: String, var lastName: String, var age: Int, var defaultValue: Any? = null) {
  /// late keyword. it can't we used with primitive data type

  lateinit var favouriteMovie:Any
    var firstName = name
        get() {
            return "First name: $field"
        }
        set(value) {
            println("$value was assigned")
            field=value
        }

    /// This is just like init in dart which will run when class object will be formed
/// you can have as many you like
    init {
        println("Object formed")
    }

    init {
        println("object formed second time")
    }


    /// This is a secondary constructor it can be used to , i don't think it
    /// needs to be used
    constructor(name: String) : this(name, "last name", 5) {}

     /// It works as static keyword
     companion object {
         var max=100;
         fun sum(s:Int):Int{
             return s;
         }
     }
}