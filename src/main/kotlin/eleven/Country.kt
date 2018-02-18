package eleven

import org.jetbrains.exposed.sql.Table

object Country: Table() {
    val id = integer("id").autoIncrement().primaryKey()
    val name = varchar("name", 50)
}