package hm.o.sph.init.attr

import hm.o.sph.init.Registries
import hm.o.sph.init.util.Tier
import net.minecraft.util.registry.RegistryEntry

class Imprint(tier: Tier, series: ImprintSeries, attr: Array<MutableSet<Attribute>>) {
    val entry: RegistryEntry<Imprint> by lazy {
        Registries.IMPRINT.createEntry(this)
    }
}

data class UsableImprint(val base: Imprint, val bounds: Array<MutableSet<UsableAttribute>>) {
    val result: MutableMap<Attribute, Int> by lazy {
        val mapRes = HashMap<Attribute, Int>()
        bounds.forEach { bound ->
            bound.forEach { attr ->
                mapRes[attr.base] = attr.result
            }
        }
        mapRes
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UsableImprint

        if (base != other.base) return false
        if (!bounds.contentEquals(other.bounds)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = base.hashCode()
        result = 31 * result + bounds.contentHashCode()
        return result
    }
}
