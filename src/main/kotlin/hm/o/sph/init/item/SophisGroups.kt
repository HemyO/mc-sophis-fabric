package hm.o.sph.init.item

import hm.o.sph.Sophis.MODID
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder.build
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.util.Identifier.of

object SophisGroups {

    val UNDEF: ItemGroup = build(of(MODID, "undef")) { ItemStack(Items.BONE)}
    val MATERIAL: ItemGroup = build(of(MODID, "material")) { ItemStack(Items.BONE) }
    val EQUIPMENT: ItemGroup = build(of(MODID, "equipment")) { ItemStack(Items.BONE) }

}