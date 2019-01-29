package excercises

import org.junit.Assert
import org.junit.Test

class ExtensionNumbersTest {

    @Test fun percentOfNumber() {
        Assert.assertEquals(10.0f, 10.0f.percentOf(100.0f), .01f)
    }

    @Test fun percentOfNumberCustomPrecision() {
        Assert.assertEquals(0.036f, 33.0f.percentOf(91919.0f).customPrecision(3))
    }
}

