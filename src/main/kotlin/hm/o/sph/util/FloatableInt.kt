@file:Suppress("unused")

package hm.o.sph.util

import kotlin.math.absoluteValue

/**
 * `FloatableInt` is an `Int` value which use integer to express 3-decimal places of float. If the value is integer, you need to time 1000.
 * If the value is float value, you can just remove the dot.
 *
 * Integer case: `5` → `FloatableInt(5000)`
 *
 * Float case: `5.125` → `FloatableInt(5125)`
 */
data class FloatableInt(val value: Int) {
    val int = value / 1000
    val long = int.toLong()
    val float = value / 1000F
    val double = float.toDouble()
}

val Int.toFloatableInt: FloatableInt get() = FloatableInt(absoluteValue * 1000)

val Long.toFloatableInt: FloatableInt get() = FloatableInt((absoluteValue * 1000).toInt())

val Float.toFloatableInt: FloatableInt get() = FloatableInt((absoluteValue * 1000).toInt())

val Double.toFloatableInt: FloatableInt get() = FloatableInt((absoluteValue * 1000).toInt())