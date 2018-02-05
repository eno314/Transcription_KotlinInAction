package ten

import org.junit.Assert
import org.junit.Test

const val TEST_TIMEOUT = 100L

class MyTest {
    // @Testアノテーションは、JUnitフレームワークにテストとして実行したいメソッドを教える
    @Test
    fun testTrue() {
        Assert.assertTrue(true)
    }

    @Test(timeout = TEST_TIMEOUT)
    fun testMethod() {
        Assert.assertTrue(true)
    }
}
