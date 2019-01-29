package excercises

import java.math.BigDecimal
import java.math.RoundingMode

fun Float.percentOf(value: Float) = (this / value) * 100

fun Float.customPrecision(precision: Int) = BigDecimal(this.toString()).setScale(precision, RoundingMode.HALF_UP).toFloat()