@file:Suppress("unused")

package hm.o.sph.util

import hm.o.sph.Sophis
import java.util.regex.Pattern

infix fun String.cut(str: String): MutableList<String> { return split(str).flatMap { listOf(it, str) }.dropLast(1).filterNot { it.isEmpty() }.toMutableList() }

fun String.cut(vararg strLs: String): MutableList<String> { return this cut strLs.toMutableList() }

infix fun String.cut(strLs: List<String>): MutableList<String> {
    var res = mutableListOf(this)
    strLs.forEach { str -> res = res.flatMap { it cut str }.toMutableList() }
    return res
}

fun Any.println() { println(this.toString()) }

fun Any.info() { Sophis.INFO(this.toString()) }

fun Any.warn() { Sophis.WARN(this.toString()) }

fun Any.error() { Sophis.ERROR(this.toString()) }

fun Any.debug() { Sophis.DEBUG(this.toString()) }

inline val List<Char>.string get() = this.map { it.toString() }

inline val Any.string get() = this.toString()

inline val String.hasCJK get() = Pattern.compile("[\\p{IsHan}\\p{IsHangul}\\p{IsKatakana}\\p{IsHiragana}]").matcher(this).find()

val hasCJK = { string: String -> val isCJK = Pattern.compile("[\\p{IsHan}\\p{IsHangul}\\p{IsKatakana}\\p{IsHiragana}]"); isCJK.matcher(string).find() }