package ten

import org.junit.Assert
import org.junit.Test

class MyTest {
    // @Testアノテーションは、JUnitフレームワークにテストとして実行したいメソッドを教える
    @Test fun testTrue() {
        Assert.assertTrue(true)
    }
}
