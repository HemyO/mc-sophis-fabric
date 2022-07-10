package hm.o.sph.init.attr

import hm.o.sph.init.Registries
import hm.o.sph.util.FloatableInt
import net.minecraft.util.registry.RegistryEntry
import java.time.LocalDateTime
import java.time.ZoneOffset
import kotlin.random.Random

class Attribute(val mode: NumberMode) {
    val entry: RegistryEntry<Attribute> by lazy {
        Registries.ATTRIBUTE.createEntry(this)
    }
}
// TODO: NumberMode to Attribute class because of its general.
data class UsableAttribute(val base: Attribute, val bound: Pair<FloatableInt, FloatableInt>) {
    val result: FloatableInt by lazy {
        when (base.mode) {
            NumberMode.INTEGER -> FloatableInt(
                IntRange(
                    minOf(bound.first.value,+ bound.second.value.floorDiv(1000) * 1000 + 999),
                    maxOf(bound.first.value, bound.second.value.floorDiv(1000) * 1000 + 999)
                ).random(Random(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)))
            )
            NumberMode.PERCENT -> FloatableInt(
                IntRange(
                    minOf(bound.first.value, bound.second.value),
                    maxOf(bound.first.value, bound.second.value)
                ).random(Random(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)))
            )
        }
    }
}

enum class NumberMode { INTEGER, PERCENT }
