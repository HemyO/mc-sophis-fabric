package hm.o.sph

import hm.o.sph.init.item.Categories
import hm.o.sph.init.item.SophisItem
import hm.o.sph.init.util.Rarity
import net.fabricmc.api.ModInitializer
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import org.slf4j.LoggerFactory

@Suppress("MemberVisibilityCanBePrivate")
object Sophis {

    const val MODID = "sph"
    val LOGGER = LoggerFactory.getLogger(MODID.uppercase())!!

    @Suppress("unused")
    val init = ModInitializer {
        val SPHALERITE = SophisItem( Item.Settings().group(Categories.ORE.group).fireproof(), "sphalerite", Categories.ORE, 20, Rarity.DREAMY)
        Registry.register(Registry.ITEM, Identifier.of(MODID, "sphalerite"), SPHALERITE)
        LOGGER.info("WELCOME TO SPH MOD.")
    }
}