package hm.o.sph.init.item

import net.minecraft.item.ItemGroup

data class SophisCategory(val group: ItemGroup, val id: String) {
    override fun toString() = id
}
