package seven

class Person(val name: String, age: Int, salary: Int) : PropertyChangeAware() {

    var age: Int by ObservableProperty(age, changeSupport)

    var salary: Int by ObservableProperty(salary, changeSupport)
}
