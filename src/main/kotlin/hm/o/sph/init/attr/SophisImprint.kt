package hm.o.sph.init.attr

import hm.o.sph.init.Registries
import hm.o.sph.init.item.EquipmentItem
import hm.o.sph.util.FilterList
import hm.o.sph.util.FloatableInt
import net.minecraft.util.registry.RegistryEntry

// TODO Increase Condition Event
class Imprint(
    val abstractBound: Map<String, Pair<FloatableInt, FloatableInt>>,
    val mode: ImprintMode,
    val filterLs: FilterList<EquipmentItem>
) {
    val entry: RegistryEntry<Imprint> by lazy {
        Registries.IMPRINT.createEntry(this)
    }
}

enum class ImprintMode { DOMINANT, RECESSIVE, UNIQUE }

data class UsableImprint(
    val base: Imprint,
) {
}
