package hm.o.sph.init.item

import hm.o.sph.init.util.Rarity
import net.minecraft.item.Item

open class SophisItem(
    settings: Settings,
    protected open val category: Category,
    protected open val credit: Int,
    protected open val rarity: Rarity
) : Item(settings)

open class EquipmentItem(
    settings: Settings,
    protected open val basicAttrs: MutableSet<String>,
    override val category: Category,
    override val credit: Int,
    override val rarity: Rarity
) : SophisItem(settings, category, credit, rarity) {
    val imps = HashSet<String>()
}