package eleven

import org.jetbrains.exposed.sql.Table

object Customer: Table() {
    val id = integer("id").autoIncrement().primaryKey()
    val name = varchar("name", 50)
    val countryId = integer("country_id")
}