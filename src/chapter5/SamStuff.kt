package chapter5

object SamStuff{
    fun createAllDoneRunnable(): Runnable{
        return Runnable{println("all done!")}
    }
}

fun main(){
    SamStuff.createAllDoneRunnable().run()
}
