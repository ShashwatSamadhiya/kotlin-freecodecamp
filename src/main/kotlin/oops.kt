/**
 You can pass parameter or value class using()
 if you add var or val to parameter it became properties

 Properties can be understandable as member of class

 You can not use parameter inside of class other than assigning it to
 other variable
 */

class Car(var name: String,  model:String,){

    var model=model
    var color =""
    var doors=0

    fun move(){
        println("the car $name  $model is moving")
    }

    fun stop()
    {
        println("the car has stopped")
    }

}