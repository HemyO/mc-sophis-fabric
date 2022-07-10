package hm.o.sph.init.item

import hm.o.sph.init.util.Rarity
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.world.World

open class SophisItem(
    settings: Settings,
    open val id: String,
    open val category: SophisCategory,
    open val credit: Int,
    open val rarity: Rarity
) : Item(settings) {
    override fun appendTooltip(
        stack: ItemStack?,
        world: World?,
        tooltip: MutableList<Text>?,
        context: TooltipContext?
    ) {


    }
}

open class EquipmentItem(
    settings: Settings,
    open val basicAttrs: MutableSet<String>,
    open val droppable: Boolean,
    override val id: String,
    override val category: SophisCategory,
    override val credit: Int,
    override val rarity: Rarity
) : SophisItem(settings, id, category, credit, rarity) {
    val imps = HashSet<String>()
}