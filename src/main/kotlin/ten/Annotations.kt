package ten

@Target(AnnotationTarget.PROPERTY)
annotation class JsonExclude

annotation class JsonName(val name: String)
