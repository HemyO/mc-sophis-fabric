package hm.o.sph

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

@Suppress("MemberVisibilityCanBePrivate")
object Sophis {

    const val MODID = "sph"
    val LOGGER = LoggerFactory.getLogger(MODID.uppercase())!!

    @Suppress("unused")
    val init = ModInitializer {
        LOGGER.info("WELCOME TO SPH MOD.")
    }
}