package hm.o.sph

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

@Suppress("MemberVisibilityCanBePrivate")
object Sophis {

    const val MODID = "sph"
    private val LOGGER = LoggerFactory.getLogger(MODID.uppercase())!!
    val INFO = { msg: String -> LOGGER.info(msg) }
    val WARN = { msg: String -> LOGGER.warn(msg) }
    val ERROR = { msg: String -> LOGGER.error(msg) }
    val DEBUG = { msg: String -> LOGGER.debug(msg) }

    @Suppress("unused")
    val init = ModInitializer {

    }
}