package hm.o.sph.init

import hm.o.sph.Sophis.MODID
import hm.o.sph.init.attr.Attribute
import hm.o.sph.init.attr.Imprint
import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder.createDefaulted
import net.minecraft.util.Identifier.of
import net.minecraft.util.registry.Registry

object Registries {

    val ATTRIBUTE: Registry<Attribute> = createDefaulted(
        Attribute::class.java, of(MODID, "attribute"), of(MODID, "stage_level")
    ).buildAndRegister()

    val IMPRINT: Registry<Imprint> = createDefaulted(
        Imprint::class.java, of(MODID, "imprint"), of(MODID, "empty")
    ).buildAndRegister()

}