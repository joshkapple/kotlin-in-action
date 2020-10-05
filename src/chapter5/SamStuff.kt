package chapter5

object SamStuff{
    fun createAllDoneRunnable(): Runnable{
        return Runnable{println("all done!")}
    }

    class RunnableThing: Runnable{
        override fun run() {println("I ran")}
    }
}

fun main(){
    SamStuff.createAllDoneRunnable().run()
    SamStuff.RunnableThing().run()
}
