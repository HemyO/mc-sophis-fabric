package hm.o.sph.init.attr

import hm.o.sph.init.Registries
import net.minecraft.util.registry.RegistryEntry
import java.time.LocalDateTime
import java.time.ZoneOffset
import kotlin.random.Random

class Attribute {
    val entry: RegistryEntry<Attribute> by lazy {
        Registries.ATTRIBUTE.createEntry(this)
    }
}

data class UsableAttribute(val base: Attribute, val bound: Pair<Int, Int>) {
    val result: Int by lazy {
        IntRange(minOf(bound.first, bound.second), maxOf(bound.first, bound.second))
            .random(Random(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC)))
    }
}