package ten

import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class HasTempFolder {
    // プロパティではなく、getterにアノテーションが付いている
    @get:Rule
    val folder = TemporaryFolder()

    @Test
    fun testUsingTempFolder() {
        val createFile = folder.newFile("myfile.text")
        val createFolder = folder.newFolder("subfolder")
    }
}
