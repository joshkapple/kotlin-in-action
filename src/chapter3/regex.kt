package chapter3

// normal method using kotlin's collection extensions
fun parsePath(path: String){
    val dir = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName: String = fullName.substringBeforeLast(".")
    val ext: String = fullName.substringAfterLast(".")

    println("Dir: $dir, name: $fileName, ext: $ext")
}

// regex version
fun parsePathRegex(path:String){
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null){
        val (dir, fileName, ext) = matchResult.destructured
        println("Dir: $dir, name: $fileName, ext: $ext")

    }
}



fun main(){
    parsePath("/users/home/josh/superawesomefile.txt")
    //parsePathRegex
    ("/users/home/josh/superawesomefile.txt")
}
