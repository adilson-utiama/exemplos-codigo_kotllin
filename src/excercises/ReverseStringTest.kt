package excercises

import org.junit.Assert
import org.junit.Test

class ReverseStringTest {

    @Test fun reverseUsingStringBuilder() {
        Assert.assertEquals("bs niltok", reverseUsingStringBuilder("kotlin sb"))
    }

    @Test fun reverseUsingLoop() {
        Assert.assertEquals("pool niltok", reverseUsingLoop("kotlin loop"))
    }
}

