package seven

class Person(val name: String, age: Int, salary: Int) : PropertyChangeAware() {

    var age: Int = age
        set(newValue) {
            // 「field」識別子でプロパティのバッキングフィールドにアクセス
            val oldValue = field
            field = newValue
            // プロパティの値の変更についてリスナに通知
            changeSupport.firePropertyChange("age", oldValue, newValue)
        }

    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange("salary", oldValue, newValue)
        }
}
