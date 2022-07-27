@file:Suppress("unused")

package hm.o.sph.util

inline val <T> List<T>.head get() = first()

inline val <T> List<T>.tail get() = drop(1)

inline val <T> List<T>.last get() = last()

inline val <T> List<T>.init get() = dropLast(1)

inline val <T> MutableList<T>.rmhead get() = removeAt(0)

inline val <T> MutableList<T>.rmlast get() = removeAt(lastIndex)