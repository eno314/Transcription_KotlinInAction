package eleven

data class Issue(
        val id: String,
        val project: String,
        val type: String,
        val priority: String,
        val description: String
)

// 関数の型としてベースクラスを使用する
class ImportantIssuesPredicate(val project: String) : (Issue) -> Boolean {

    // invokeメソッドを実装
    override fun invoke(issue: Issue): Boolean {
        return issue.project == project && issue.isImportant()
    }

    private fun Issue.isImportant(): Boolean {
        return type == "Bug" && (priority == "Major" || priority == "Critical")
    }
}