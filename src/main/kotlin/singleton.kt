
class SingletonClass private constructor(){
    companion object{
        private var instance:SingletonClass?=null

        fun getInstance():SingletonClass?{
            if(instance==null){
                instance=SingletonClass()
            }
            return instance
        }
    }
}

/// Another method to make singleton
object  Singleton{

}