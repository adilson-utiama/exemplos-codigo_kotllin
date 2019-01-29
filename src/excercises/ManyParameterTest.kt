package excercises

import org.junit.Assert
import org.junit.Test

class ManyParameterTest {


    @Test fun sumAllParameters() {
        Assert.assertEquals(20, sumAllParameters(5, 5, 5 ,5))
    }

    @Test fun sumAllGenericParameters() {
        Assert.assertEquals(10.0, sumAllGenericParameters(1, 2, "", "2", 2.0, "10", 5), .01)
    }
}