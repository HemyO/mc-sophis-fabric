package hm.o.sph.init.item

import net.minecraft.item.ItemGroup

data class Category(val group: ItemGroup, val name: String) {
    override fun toString() = name
}
