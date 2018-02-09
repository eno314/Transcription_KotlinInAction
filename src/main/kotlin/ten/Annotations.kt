package ten

@Target(AnnotationTarget.PROPERTY)
annotation class JsonExclude

annotation class JsonName(val name: String)

@Target(AnnotationTarget.ANNOTATION_CLASS)
annotation class BindingAnnotation

@BindingAnnotation
annotation class MyBinding
