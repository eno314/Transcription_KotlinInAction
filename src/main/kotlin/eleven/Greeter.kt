package eleven

class Greeter(val greeting: String) {
    // Greeterクラスにinvokeメソッドを定義
    operator fun invoke(name: String) {
        println("$greeting, $name!")
    }
}