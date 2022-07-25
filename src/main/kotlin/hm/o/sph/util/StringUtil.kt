package hm.o.sph.util

import hm.o.sph.Sophis

infix fun String.cut(str: String): MutableList<String> {
    return split(str).flatMap { listOf(it, str) }.dropLast(1).filterNot { it.isEmpty() }.toMutableList()
}

fun String.cut(vararg strLs: String): MutableList<String> {
    return this cut strLs.toMutableList()
}

infix fun String.cut(strLs: List<String>): MutableList<String> {
    var res = mutableListOf(this)
    strLs.forEach { str ->
        res = res.flatMap { it cut str }.toMutableList()
    }
    return res
}

fun String.println() {
    println(this)
}

fun String.info() {
    Sophis.INFO(this)
}

fun String.warn() {
    Sophis.WARN(this)
}

fun String.error() {
    Sophis.ERROR(this)
}

fun String.debug() {
    Sophis.DEBUG(this)
}

inline val List<Char>.string
    get() = this.map { it.toString() }