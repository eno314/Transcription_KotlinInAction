package eleven

class DependencyHandler {
    // 通常のコマンドAPIを定義する
    fun compile(coordinate: String) {
        println("Added dependency on $coordinate")
    }

    // DSL API をサポートするためにinvokeを定義する
    operator fun invoke(body: DependencyHandler.() -> Unit) {
        body()
    }
}