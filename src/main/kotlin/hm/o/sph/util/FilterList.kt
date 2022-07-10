package hm.o.sph.util

import hm.o.sph.util.FilterMode.BLACK
import hm.o.sph.util.FilterMode.WHITE

/**
 * `FilterList` include a `MutableSet` to store the object in whitelist or blacklist.
 * In this list, whitelist must shadow blacklist.
 */
data class FilterList<T>(private val ls: MutableSet<Pair<FilterMode, T>> = mutableSetOf()) {

    infix operator fun plusAssign(filterObj: Pair<FilterMode, T>) {
        ls += filterObj
    }

    infix operator fun minusAssign(filterObj: Pair<FilterMode, T>) {
        ls -= filterObj
    }

    /**
     * Check the object is in whitelist or blacklist. Please notice, if whitelist is not empty, blacklist must be ignored.
     *
     * It' s return `true` if object is in whitelist which is not empty or not in blacklist.
     */
    infix operator fun contains(filterObj: T): Boolean {
        if (filterObj in wl) return true
        if (wl.isNotEmpty()) return false
        if (filterObj in bl) return false
        return true
    }

    val whitelist: Set<T>
        get() = ls
            .filter { obj -> obj.first == WHITE }
            .map { obj -> obj.second }
            .toSet()

    val blacklist: Set<T>
        get() = ls
            .filter { obj -> obj.first == BLACK }
            .map { obj -> obj.second }
            .toSet()

    val wl: Set<T>
        get() = whitelist

    val bl: Set<T>
        get() = blacklist

}

enum class FilterMode { WHITE, BLACK }