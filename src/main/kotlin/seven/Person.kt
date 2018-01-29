package seven

class Person(val name: String) {
    // _emailsプロパティにはemailsが委譲するデータを格納する
    private var _emails: List<Email>? = null

    val emails: List<Email>
        get() {
            if (_emails == null) {
                // アクセス時にデータをロードする
                _emails = loadEmails(this)
            }
            // 既にデータがロードされていたら、それを返す
            return _emails!!
        }
}
