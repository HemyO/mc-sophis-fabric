package hm.o.sph.init.item

enum class SophisInhabitant(val id: String) {
    DOOM("doom"),
    GOD("god"),
    ANCIENT("ancient"),
    SHIB_VAZAR("sib_vazar");

    override fun toString(): String {
        return this.id
    }
}