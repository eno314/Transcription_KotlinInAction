package nine

class Processor<T> {
    fun process(value: T) {
        // valueはnull許容なので、安全呼び出しを使う必要がある
        value?.hashCode()
    }
}
