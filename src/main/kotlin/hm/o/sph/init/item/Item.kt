package hm.o.sph.init.item

import hm.o.sph.init.util.Rarity
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.world.World

open class SophisItem(
    settings: Settings,
    protected open val id: String,
    protected open val category: Category,
    protected open val credit: Int,
    protected open val rarity: Rarity
) : Item(settings) {
    override fun appendTooltip(
        stack: ItemStack?,
        world: World?,
        tooltip: MutableList<Text>?,
        context: TooltipContext?
    ) {
        tooltip?.add(Text.translatable(genDivide))
    }
}

open class EquipmentItem(
    settings: Settings,
    protected open val basicAttrs: MutableSet<String>,
    override val id: String,
    override val category: Category,
    override val credit: Int,
    override val rarity: Rarity
) : SophisItem(settings, id, category, credit, rarity) {
    val imps = HashSet<String>()
}